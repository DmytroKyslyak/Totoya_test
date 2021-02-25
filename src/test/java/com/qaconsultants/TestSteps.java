package com.qaconsultants;

import com.codeborne.selenide.Configuration;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * @author Danny Briskin (DBriskin@qaconsultants.com)
 * for testCucumerWeb project.
 */
public class TestSteps implements En {
    PageObject1 pageObject1;


    public TestSteps() {
        Given("^I open login page$", () -> {
            Configuration.browserBinary = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
            Configuration.browser = "chrome";
//            System.setProperty("webdriver.gecko.driver", "C:/path/to/geckodriver.exe");
            System.setProperty("webdriver.chrome.driver", "C:\\Toyota\\chromedriver\\chromedriver.exe");
            System.out.println("I open login page");
        });
        When("^I open browser$", () -> {
            open("http://admin:admin@localhost:8090");
            sleep(3000);
            pageObject1=page(PageObject1.class);
        });
        And("^I press button$", () -> {
           //$(By.xpath("//button[@class=\"mat-paginator-navigation-last mat-icon-button mat-button-base ng-star-inserted\"]")).click();
            pageObject1.clickButtom();
        });
        And("^I check element$", () -> {
            $(By.xpath("//tr[last()]/td/a")).click();
            sleep(3000);
        });
        And("^I click button$", () -> {
            int random_int = (int)(Math.random() * (99 - 10 + 1) + 10);
            String s=String.valueOf(random_int);
            //System.out.println($(By.xpath("//input[@name='paymentAmount']")).text());
          //System.out.println($(By.xpath("//mat-label[text()='paymentAmount']/ancestor::span/preceding-sibling::input")).getValue());
            $(By.xpath("//mat-label[text()='paymentAmount']/ancestor::span/preceding-sibling::input")).setValue(s);
            $(By.xpath("//button[@aria-label=\"Open calendar\"]")).click();
            sleep(3000);
        });
        Then("^I check element block$", () -> {
          $(By.xpath("//div[text()='1']")).click();
          sleep(3000);
        });
        And("^I click button last page$", () -> {
            $(By.xpath("//span[text()='Update']/ancestor::button")).click();
            sleep(3000);
        });
        And("^I check last row$", () -> {
            $(By.xpath("//button[@aria-label=\"Last page\"]")).click();
            sleep(3000);
        });

    }
}
