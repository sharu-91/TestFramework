package com.ecom.testcases;

import com.ecom.base.TestBase;
import com.ecom.page.ClosePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClosePageTest extends TestBase{
    public ClosePageTest(){
        super();
    }

    ClosePage closePageTest;

    @BeforeMethod
    public void setup(){
        //initialization();
        closePageTest = new ClosePage();
    }

    @Test
    public void verifyThankyouTest(){
        String thankyou = closePageTest.thankyou();
        Assert.assertEquals(thankyou,"YOUR BOOKING HAS BEEN PLACED");

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
