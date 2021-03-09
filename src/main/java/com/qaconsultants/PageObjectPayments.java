package com.qaconsultants;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

@Component("pageObjectPayments")

public class PageObjectPayments {

    @FindBy(xpath = "//button[@aria-label=\"Last page\"]")
    private SelenideElement buttonLastPage;

    @FindBy(xpath = "//tr[last()]/td/a")
    private SelenideElement buttonPayment;

    public void clickButtonLast() {
        buttonLastPage.waitUntil(Condition.visible, 3000).click();
    }

    public void clickButtonPayment() {
        buttonPayment.waitUntil(Condition.exist, 3000).click();
    }
}


