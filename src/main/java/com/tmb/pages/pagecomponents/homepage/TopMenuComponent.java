package com.tmb.pages.pagecomponents.homepage;

import com.tmb.Utils.PageActionHelper;
import com.tmb.pages.enums.topmenucomponent.MenuType;
import com.tmb.pages.enums.topmenucomponent.SubMenuType;
import org.openqa.selenium.By;

public class TopMenuComponent {
    private static final String MENU="//span[text()='%s']//parent::a";
    private static final String SUBMENU="//span[text()[normalize-space()='%s']]";

    public TopMenuComponent clickMenuItem(MenuType menuType){
        String xpath=String.format(MENU,menuType.getName());
        PageActionHelper.waitAndClick(By.xpath(xpath));
        return this;
    }
    public TopMenuComponent clickSubMenuItem(SubMenuType subMenuType){
        String xpath=String.format(SUBMENU,subMenuType.getName());
        PageActionHelper.waitAndClick(By.xpath(xpath));
        return this;
    }
}
