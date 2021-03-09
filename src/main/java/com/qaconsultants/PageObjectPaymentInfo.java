package com.qaconsultants;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

@Component("pageObjectPaymentInfo")
@Log4j2
public class PageObjectPaymentInfo {

    @Autowired
    private CustomerService customerService;
    private PaymentService paymentService;

    @FindBy(xpath = "//button[@aria-label=\"Open calendar\"]")
    private SelenideElement buttonOpenCalendar;

    @FindBy(xpath = "//div[text()='1']")
    private SelenideElement buttonSelectData;

    @FindBy(xpath = "//span[text()='Update']/ancestor::button")
    private SelenideElement buttonUpdate;

    @FindBy(xpath = "//mat-label[text()='paymentAmount']/ancestor::span/preceding-sibling::input")
    private SelenideElement paymentAmount;

    public void clickButtonOpenCalendar() {
        buttonOpenCalendar.waitUntil(Condition.visible, 3000).click();
    }

    public void setPaymentAmount() {
        int randomInt = (int) (Math.random() * (99 - 10 + 1) + 10);
        String amount = String.valueOf(randomInt);
        paymentAmount.waitUntil(Condition.exist, 3000).setValue(amount);
    }

    public void clickButtonSelectData() {
        buttonSelectData.waitUntil(Condition.exist, 3000).click();
    }

    public void clickButtonUpdate() {
        buttonUpdate.waitUntil(Condition.exist, 3000).click();
    }

    public void getCustomers() {
        //List<Customer> blockCustomers = customerService.allCustomers();
       //log.warn(blockCustomers); // выводит на экран в виде ПРЕДУПРЕЖДЕНИЧЯ

        List<Customer> blockCustomers = customerService.findByCustomerBalance(100.24);
        log.warn(blockCustomers);
    }

    public void getPayments() {
        List<Payment> allPay = paymentService.allPayment();
        log.warn(allPay);

       // List<Payment> blockPayments = paymentService.findByPaymentsPaymentAmountLessThan(10.00);
       // log.warn(blockPayments);
    }

}