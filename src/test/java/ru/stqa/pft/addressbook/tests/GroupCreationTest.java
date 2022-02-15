package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class GroupCreationTest extends TestBase {
  private boolean acceptNextAlert = true;

  @Test
  public void testGroupCreation() throws Exception {

    app.goToGroupsPage();
    app.initGroupCreation();
    app.fillGroupForm("testovaya", "testa", "test");
    app.submitGroupCreation();
    app.returnToGroupPage();
  }


}
