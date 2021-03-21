package com.qaconsultants;

import com.codeborne.selenide.Configuration;
import com.qaconsultants.db.PageObjectDB;
import com.qaconsultants.web.PageObjectWeb;
import io.cucumber.java.eo.Do;
import io.cucumber.java8.En;
import org.springframework.test.context.ContextConfiguration;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * @author Danny Briskin (DBriskin@qaconsultants.com)
 * for testCucumerWeb project.
 */
@ContextConfiguration(classes = {Configurator.class})
public class TestSteps implements En {
    PageObjectWeb pageObject1;
    PageObjectDB pageObject2;
    //PageObjectAPI pageObject3;
    Double dddbbb;
    public TestSteps() {
        Given("^I open login page$", () -> {
            Configuration.browserBinary = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
            Configuration.browser = "chrome";
            System.setProperty("webdriver.chrome.driver", "C:\\Toyota\\chromedriver\\chromedriver.exe");
            System.out.println("I open login page");
        });

        Before(SpringSelenide::getInstance);

// *********************  COMBOBOX  ****************
        When("^I open browser as \"([^\"]*)\"$", (String name) -> {
            open("http://"+name+":"+name+"@localhost:8090");
            sleep(5000);
            pageObject1 = SpringSelenide.page(PageObjectWeb.class);
            pageObject2 = SpringSelenide.getInstance().addBean(PageObjectDB.class);
        });
        And("^I set combobox \"([^\"]*)\"$", (String items) -> {
            pageObject1.clickButtonCombobox();
            pageObject1.setItem(items);
        });
        And("^I corresponding number$", () -> {
            pageObject1.verifyNumber();
        });

// *********************  NEW PAYMENT  ****************

        And("^I create new payment$", () -> {
            pageObject1.clickButtonEnterNewPayment();
            sleep(5000);
            pageObject1.setEnterCustomerId();
            sleep(5000);
            pageObject1.setNewPayment();
            pageObject1.setPaymentChannel();
            pageObject1.clickButtonCreatePayment();
            sleep(5000);
        });
        And("^I verify record$", () -> {
          pageObject1.verifyDataLastPayment();
        });
        And("^I verify record with DB$", () -> {
//            pageObject2 = SpringSelenide.getInstance().addBean(PageObjectBD.class);
            this.dddbbb = pageObject2.getLastRowPayment();
            pageObject1.verifyRecordWithDB(dddbbb);
        });

// *********************  CHANGE PAYMENT INFO  ****************

//        When("^I open browser$", () -> {
//            open("http://admin:admin@localhost:8090");
//            pageObject1 = SpringSelenide.page(PageObjectWeb.class);
//        });
        And("^I press button last page$", () -> {
            pageObject1.clickButtonLast();
        });

        And("^I click button Payment$", () -> {
            pageObject1.clickButtonPayment();

        });
        Then("^I edit Payment Info$", () -> {
            pageObject1.setPaymentAmount();
            pageObject1.clickButtonOpenCalendar();
            pageObject1.clickButtonSelectData();
        });
        And("^I click button Update$", () -> {
            pageObject1.clickButtonUpdate();
            sleep(5000);
        });
        And("^I click button last page$", () -> {
            pageObject1.clickButtonLast();
            sleep(3000);
        });

        // *********************  WORK WITH DB  ****************



        When("^I receive all customers$", () -> {
          pageObject2 = SpringSelenide.getInstance().addBean(PageObjectDB.class);
          pageObject2.getCustomers();
        });
        And("^I receive info about all payments$", () -> {
            pageObject2.getPayments();
        });
        And("^I receive customer name with sum \"([^\"]*)\"$", (String sum) -> {
            pageObject2.getTotalAmount(sum);
        });
        And("^I receive last row payment$", () -> {
            pageObject2.getLastRowPayment();
        });


// *********************  WEB SERVICE  ****************

//        When("^I receive all customers api$", () -> {
//            pageObject5 = SpringSelenide.page(PageObjectAPI.class);
//        });

    }
}
