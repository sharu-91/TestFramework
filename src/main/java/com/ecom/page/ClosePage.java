package com.ecom.page;

import com.ecom.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClosePage extends TestBase {

    @FindBy(xpath= "//div[contains(text(),'Your booking has been placed')]")
    WebElement thankyou;

    public ClosePage(){
        PageFactory.initElements(driver, this);
    }

    public String thankyou(){
        return thankyou.getText();
    }
}
