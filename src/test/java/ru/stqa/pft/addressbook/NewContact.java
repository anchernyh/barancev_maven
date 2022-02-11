package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class NewContact extends TestBase {

    @Test
        public void testNewContact() throws Exception {

            driver.findElement(By.linkText("add new")).click();
        fillNewContact("Anastasiia", "Test", "anatest", "FirstTest", "Tix", "123987654", "test@mail.com");
    }


}


