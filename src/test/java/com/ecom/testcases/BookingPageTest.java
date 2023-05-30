package com.ecom.testcases;

import com.ecom.base.TestBase;
import com.ecom.page.BookingPage;
import com.ecom.page.Checkout;
import com.ecom.page.ClosePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class BookingPageTest extends TestBase {
    Checkout checkout;
    BookingPage bookingpage;
    ClosePage closePageTest;
    public BookingPageTest(){
        super();
    }

    @BeforeMethod
    public void setup(){
        initialization();
        bookingpage = new BookingPage();

    }

   // @Test
    public void verifyTitle(){
        String title = bookingpage.verifyTitle();
        Assert.assertEquals(title, "Xola - Checkout");
    }

    @Test
    public void bookingTest(){
        driver.navigate().refresh();
        bookingpage.booking(prop.getProperty("name"), prop.getProperty("email"),prop.getProperty("phoneno"));
        String str = driver.getCurrentUrl();

    }

    @AfterMethod
    public void tearDown(){
        //driver.quit();
    }
}
