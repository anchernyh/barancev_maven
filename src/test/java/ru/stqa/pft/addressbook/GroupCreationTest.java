package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupCreationTest extends TestBase {
  private boolean acceptNextAlert = true;

  @Test
  public void testGroupCreation() throws Exception {

    goToGroupsPage();
    initGroupCreation();
    fillGroupForm("testovaya", "testa", "test");
    submitGroupCreation();
    returnToGroupPage();
  }


}
