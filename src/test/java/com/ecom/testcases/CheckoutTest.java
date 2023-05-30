package com.ecom.testcases;

import com.ecom.base.TestBase;
import com.ecom.page.Checkout;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckoutTest extends TestBase {

    Checkout checkout;
    static String url;
    public CheckoutTest(){
        super();
    }

    @BeforeMethod
    public void setup(){
        initialization();
        checkout = new Checkout();
    }

    @Test
    public void checkoutTest(){
        checkout.checkout(prop.getProperty("cardno"),"668","6689742");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
