package com.qaconsultants;

import com.codeborne.selenide.Selenide;
import com.sun.istack.NotNull;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Selenide for Spring extension to create page objects as beans
 */
@Log4j2
public class SpringSelenide extends Selenide {
    private static SpringSelenide instance;
    private final ApplicationContext context;

    public static synchronized SpringSelenide getInstance() {
        if (instance == null) {
            instance = new SpringSelenide();
        }
        return instance;
    }

    private SpringSelenide() {
        context = new AnnotationConfigApplicationContext(Configurator.class);
    }

    /* the method is static to override parent one */
    public static <P> P page(Class<P> pageObjectClass) {
        try {
            // here is the trick - we are creating object as Selenide PageObject
            // and Spring bean in the same time
            return page(getInstance()
                    .context.getBean(pageObjectClass.getSimpleName(), pageObjectClass));
        } catch (Exception e) {
            log.error("Failed to create new instance of {}", pageObjectClass);
            log.catching(e);
            return null;
        }
    }
    public <P> P addBean(Class<P> pageObjectClass) {
        return context.getBean(getBeanName(pageObjectClass), pageObjectClass);
    }
    @NotNull
    private <P> String getBeanName(@NotNull Class<P> pageObjectClass) {
        // find bean name based on lowercased first character class name
        // because there can be several page object classes for one page
        String beanClassName = pageObjectClass.getSimpleName();
        String beanName;
        // sping beans with 2 and more leading uppercase characters do not lowercase first one
        if (beanClassName.substring(1, 2).matches("[a-z]")) {
            beanName = beanClassName.substring(0, 1).toLowerCase()
                    + beanClassName.substring(1);
        } else {
            beanName = beanClassName;
        }
        return beanName;
    }
}
