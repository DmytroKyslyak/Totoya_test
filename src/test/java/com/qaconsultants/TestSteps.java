package com.qaconsultants;

import com.codeborne.selenide.Configuration;
import io.cucumber.java8.En;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * @author Danny Briskin (DBriskin@qaconsultants.com)
 * for testCucumerWeb project.
 */
public class TestSteps implements En {
    Payments pageObject1;
    PaymentInfo pageObject2;

    public TestSteps() {
        Given("^I open login page$", () -> {
            Configuration.browserBinary = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
            Configuration.browser = "chrome";
            System.setProperty("webdriver.chrome.driver", "C:\\Toyota\\chromedriver\\chromedriver.exe");
            System.out.println("I open login page");
        });

        Before(SpringSelenide::getInstance);

        When("^I open browser$", () -> {
            open("http://admin:admin@localhost:8090");
            pageObject1 = SpringSelenide.page(Payments.class);
        });
        And("^I press button last page$", () -> {
            pageObject1.clickButtonLast();
        });

        And("^I click button Payment$", () -> {
            pageObject1.clickButtonPayment();
            pageObject2 = SpringSelenide.page(PaymentInfo.class);
        });
        Then("^I edit Payment Info$", () -> {
            pageObject2.setPaymentAmount();
            pageObject2.clickButtonOpenCalendar();
            pageObject2.clickButtonSelectData();
        });
        And("^I click button Update$", () -> {
            pageObject2.clickButtonUpdate();
        });
        And("^I check last row$", () -> {
            pageObject1.clickButtonLast();
            sleep(3000);
        });
    }
}
