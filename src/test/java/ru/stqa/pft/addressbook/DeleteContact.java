package ru.stqa.pft.addressbook;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteContact extends TestBase{



    @Test
    public void testDeleteContact() throws Exception {
        //id меняется
        driver.findElement(By.id("6")).click();

        driver.findElement(By.xpath("//input[@value='Delete']")).click();
        assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
        driver.findElement(By.id("content")).click();
    }



}
