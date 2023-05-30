package com.ecom.page;

import com.ecom.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BookingPage extends TestBase {

    @FindBy(xpath = "//button[@aria-label='Increase Adults by 1. Current count is 1']")
    WebElement adultincrease;

    @FindBy(xpath = "//button[@aria-label='Increase Children by 1. Current count is 0']")
    WebElement childrenincrease;

    @FindBy(xpath = "//a[@data-handler='next']//button[@aria-label='Next Month'][normalize-space()='rightcaret']")
    //a[@data-handler='next']//button[@aria-label='Next Month'][normalize-space()='rightcaret']
    WebElement calenderright;

    @FindBy(xpath = "//div[@aria-label='Jun 2, 2023']//var[1]")
    WebElement june1;

    @FindBy(xpath = "//button[@value='1000']")
    WebElement timebutton;

    @FindBy(xpath = "//input[@id='customerName']")
    WebElement fullname;

    @FindBy(id = "customerEmail")
    WebElement email;

    @FindBy(id = "phone")
    WebElement phone;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement btncontinue;

    public BookingPage(){
        PageFactory.initElements(driver, this);
    }

    public String verifyTitle(){
       return driver.getTitle();
        //Xola - Checkout
    }

    public Checkout booking(String custname, String custemail, String custphoneno){
        adultincrease.click();
        childrenincrease.click();
        calenderright.click();
        june1.click();
        timebutton.click();
        fullname.sendKeys(custname);
        email.sendKeys(custemail);
        phone.sendKeys(custphoneno);
        btncontinue.click();
        return new Checkout();
    }

}
