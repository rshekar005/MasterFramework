package com.tmb.tests.web;

import com.tmb.pages.LoginPage;
import com.tmb.pages.enums.topmenucomponent.MenuType;
import com.tmb.pages.enums.topmenucomponent.SubMenuType;
import com.tmb.tests.web.base.WebBase;
import org.testng.annotations.Test;

public class AddUsersTest extends WebBase {

    @Test
    public void test(){
        new LoginPage().loginApplication("Admin","admin123")
                .navigateToUsersPage()
                .getAddUserComponent()
                .clickAddButton();
    }
}
