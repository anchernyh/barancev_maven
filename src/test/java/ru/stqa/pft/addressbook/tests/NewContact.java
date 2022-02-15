package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.TestBase;

public class NewContact extends TestBase {

    @Test
        public void testNewContact() throws Exception {

            app.driver.findElement(By.linkText("add new")).click();
        app.getNewContactHelper().fillNewContact("Anastasiia", "Test", "anatest", "FirstTest", "Tix", "123987654", "test@mail.com");
    }


}


