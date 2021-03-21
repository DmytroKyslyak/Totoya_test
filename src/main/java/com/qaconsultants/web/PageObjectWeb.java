package com.qaconsultants.web;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.SelenideElementListIterator;
import com.qaconsultants.db.*;
import io.cucumber.java.eo.Do;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Component("PageObjectWeb")
@Log4j2
public class PageObjectWeb {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private PaymentService paymentService;

    @FindBy(xpath = "//button[@aria-label=\"Last page\"]")
    private SelenideElement buttonLastPage;

    @FindBy(xpath = "//tr[last()]/td/a")
    private SelenideElement buttonPayment;

    @FindBy(xpath = "//span[text()='Enter new payment ']/ancestor::button")
    private SelenideElement buttonEnterNewPayment;

    @FindBy(xpath = "//input[@placeholder='Enter customerId']")
    private SelenideElement enterCustomerId;

    @FindBy(xpath = "//input[@id='mat-input-1']")
    private SelenideElement enterPaymentPaymentAmount;

    @FindBy(xpath = "//input[@id='mat-input-2']")
    private SelenideElement enterPaymentChannel;

    @FindBy(xpath = "//span[text()='Create Payment']/ancestor::button")
    private SelenideElement buttonCreatePayment;

    @FindBy(xpath = "//button[@aria-label=\"Open calendar\"]")
    private SelenideElement buttonOpenCalendar;

    @FindBy(xpath = "//div[text()='1']")
    private SelenideElement buttonSelectData;

    @FindBy(xpath = "//span[text()='Update']/ancestor::button")
    private SelenideElement buttonUpdate;

    @FindBy(xpath = "//mat-label[text()='paymentAmount']/ancestor::span/preceding-sibling::input")
    private SelenideElement paymentAmount;

    @FindBy(xpath = "//tr[last()]/td[1]")
    private SelenideElement lastRowNumber;

    @FindBy(xpath = "//div[@class=\"mat-select-arrow-wrapper\"]")
    private SelenideElement buttonCombobox;

    @FindBy(xpath = "//tr[last()]/td[1]")
    private SelenideElement lastRowFitstTd;

    @FindBy(xpath = "//tr[last()]/td[2]")
    private SelenideElement lastRowSecondTd;

    @FindBy(xpath = "//tbody/tr")
    private SelenideElement rows;


    Double randomInt = (Double) (Math.random() * (99 - 10 + 1) + 10);
    //String amount = String.valueOf(randomInt);
    String amount = String.format("%.2f", randomInt);
    String generatedString = RandomStringUtils.randomAlphabetic(10);
    String sss;

    public void clickButtonOpenCalendar() {
        buttonOpenCalendar.waitUntil(Condition.visible, 3000).click();
    }

    public void setPaymentAmount() {
        paymentAmount.waitUntil(Condition.exist, 3000).setValue(amount);
    }

    public void clickButtonSelectData() {
        buttonSelectData.waitUntil(Condition.exist, 3000).click();
    }

    public void clickButtonUpdate() {
        buttonUpdate.waitUntil(Condition.exist, 3000).click();
    }

    public void getCustomers() {
        List<Customer> blockCustomers = customerService.findByCustomerBalance(100.24);
        log.warn(blockCustomers);
    }

    public void getPayments() {
        List<Payment> allPay = paymentService.allPayment();
        log.warn(allPay);
    }

    public void clickButtonEnterNewPayment() {
        buttonEnterNewPayment.click();
    }

    public void setEnterCustomerId() {
        enterCustomerId.setValue("1");
    }

    public void setNewPayment() {
        enterPaymentPaymentAmount.waitUntil(Condition.exist, 3000).setValue(amount);
    }

    public void setPaymentChannel() {
        enterPaymentChannel.waitUntil(Condition.exist, 3000).setValue(generatedString);
    }

    public void clickButtonCreatePayment() {
        buttonCreatePayment.waitUntil(Condition.exist, 3000).click();
    }

//    public void compareNewPayment() {
//        assertEquals(amount, 56, "No equals");
//      }

    public void clickButtonLast() {
        buttonLastPage.waitUntil(Condition.exist, 3000).click();
    }

    public void clickButtonPayment() {
        buttonPayment.waitUntil(Condition.exist, 3000).click();
    }

    public void clickButtonCombobox() {
        buttonCombobox.click();
    }

    public void setItem(String items) {
                $(byXpath("//mat-option/span[text()='" + items + "']")).click();
        sss = items;
    }
    public void verifyNumber() {
        assertEquals(lastRowFitstTd.text(), sss, "Not Equals");
    }

    public void verifyDataLastPayment() {
        assertEquals(lastRowSecondTd.text(), amount, "Not Equals");
        log.warn(lastRowSecondTd.text());
        log.warn(amount);
    }

    public void verifyRecordWithDB(Double dddbbb) {
        assertEquals(dddbbb, Double.parseDouble(amount), "Not Equals");
    }
}


