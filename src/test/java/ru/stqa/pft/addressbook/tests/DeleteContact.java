package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import ru.stqa.pft.addressbook.appmanager.TestBase;

public class DeleteContact extends TestBase {



    @Test
    public void testDeleteContact() throws Exception {
        //id меняется
        app.driver.findElement(By.id("8")).click();

        app.driver.findElement(By.xpath("//input[@value='Delete']")).click();
        assertTrue(app.closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
        app.driver.findElement(By.id("content")).click();
    }



}
