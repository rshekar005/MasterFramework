package com.tmb.pages;

import com.tmb.Utils.PageActionHelper;
import org.openqa.selenium.By;

public class LoginPage {

    private static final By USER_NAME_TEXT_BOX=By.xpath("//input[@name='username']");
    private static final By PASSWORD_TEXT_BOX=By.xpath("//input[@name='password']");
    private static final By LOGIN_BUTTON=By.xpath("//button[@type='submit']");

    private LoginPage setUserName(String userName){
        PageActionHelper.waitAndSendKeys(USER_NAME_TEXT_BOX,userName);
        return this;
    }
    private LoginPage setPassword(String password){
        PageActionHelper.waitAndSendKeys(PASSWORD_TEXT_BOX,password);
        return this;
    }
    private HomePage setLoginButton(){
        PageActionHelper.waitAndClick(LOGIN_BUTTON);
        return new HomePage();
    }

    public HomePage loginApplication(String userName, String password){
       return setUserName(userName).setPassword(password).setLoginButton();
    }

}
