package com.qaconsultants;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class PageObject1 {
    @FindBy(xpath ="//button[@aria-label=\"Last page\"]") private SelenideElement buttonLastPage;

    public void clickButtom(){
        buttonLastPage.click();
        sleep(3000);
    }

}
