package com.ecom.page;

import com.ecom.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Checkout extends TestBase {
    @FindBy(xpath = "//input[@id='cc-number']" )
    WebElement cardno;

    @FindBy(name = "cvv")
    WebElement cvvv;

    @FindBy(name = "expiryMonth")
    WebElement expirymm;

    @FindBy(name = "expiryYear")
    WebElement expriryyy;

    @FindBy(name = "billingPostcode")
    WebElement pincode;

    @FindBy(xpath = "//div[@id='footer']//button[1]")
    WebElement pay;

    public Checkout(){
        PageFactory.initElements(driver, this);
    }

    public ClosePage checkout(String cardno1,String cvv, String pincod1){
        cardno.sendKeys(cardno1);
        cvvv.sendKeys(cvv);
        Select selmm = new Select(expirymm);
        selmm.selectByIndex(2);
        Select selyr = new Select(expriryyy);
        selyr.selectByValue("2023");
        pincode.sendKeys(pincod1);
        pay.click();

        return new ClosePage();
    }
}
