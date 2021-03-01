package com.qaconsultants;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class PageObjectToyotaTest {



    @FindBy(xpath = "//button[@aria-label=\"Last page\"]")
    private SelenideElement buttonLastPage;

    public void clickButtonLast() {
        buttonLastPage.waitUntil(Condition.visible, 3000).click();;
    }

    @FindBy(xpath = "//tr[last()]/td/a")
    private SelenideElement buttonPayment;

    public void clickButtonPayment() {
        buttonPayment.waitUntil(Condition.visible, 3000).click();
    }

    @FindBy(xpath = "//button[@aria-label=\"Open calendar\"]")
    private SelenideElement buttonOpenCalendar;

    public void clickButtonOpenCalendar() {
        buttonOpenCalendar.waitUntil(Condition.visible, 3000).click();
    }

    @FindBy(xpath = "//div[text()='1']")
    private SelenideElement buttonSelectData;

    public void clickButtonSelectData() {
        buttonSelectData.waitUntil(Condition.visible, 3000).click();
    }

    @FindBy(xpath = "//span[text()='Update']/ancestor::button")
    private SelenideElement buttonUpdate;

    public void clickButtonUpdate() {
        buttonUpdate.waitUntil(Condition.visible, 3000).click();
    }

    @FindBy(xpath = "//mat-label[text()='paymentAmount']/ancestor::span/preceding-sibling::input")
    private SelenideElement paymentAmount;

    public void setPaymentAmount() {
        int randomInt = (int) (Math.random() * (99 - 10 + 1) + 10);
        String amount = String.valueOf(randomInt);
        paymentAmount.waitUntil(Condition.visible, 3000).setValue(amount);
    }
}


