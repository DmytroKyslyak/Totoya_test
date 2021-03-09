package com.qaconsultants;

import com.codeborne.selenide.Configuration;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * @author Danny Briskin (DBriskin@qaconsultants.com)
 * for testCucumerWeb project.
 */
public class TestSteps implements En {
    PageObjectBD pageObject1;
    PageObjectBD pageObject2;
    PageObjectBD pageObject3;

    public TestSteps() {
        Given("^I open login page$", () -> {
            Configuration.browserBinary = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
            Configuration.browser = "chrome";
            System.setProperty("webdriver.chrome.driver", "C:\\Toyota\\chromedriver\\chromedriver.exe");
            System.out.println("I open login page");
        });

        Before(SpringSelenide::getInstance);

        When("^I receive all customers$", () -> {
            pageObject2 = SpringSelenide.getInstance().addBean(PageObjectBD.class);
            pageObject2.getCustomers();
        });

        And("^I receive info about all payments$", () -> {
            pageObject2.getPayments();
        });
        And("^I receive customer name with sum \"([^\"]*)\"$", (String sum) -> {
            pageObject2.getTotalAmount(sum);
        });
    }
}
