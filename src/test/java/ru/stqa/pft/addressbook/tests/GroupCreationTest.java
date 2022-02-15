package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.appmanager.TestBase;

public class GroupCreationTest extends TestBase {
  private boolean acceptNextAlert = true;

  @Test
  public void testGroupCreation() throws Exception {

    app.goToGroupsPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm("testovaya", "testa", "test");
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }


}
