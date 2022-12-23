package com.tmb.pages.pagecomponents.adduserpage;

import com.tmb.Utils.PageActionHelper;
import org.openqa.selenium.By;

public class AddUserComponent {
    private By addButton =By.xpath("//button[text()[normalize-space()='Add']]");

    public AddUserComponent clickAddButton(){
        PageActionHelper.waitAndClick(addButton);
        return this;
    }

}
