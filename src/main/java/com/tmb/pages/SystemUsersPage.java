package com.tmb.pages;

import com.tmb.pages.pagecomponents.adduserpage.AddUserComponent;
import com.tmb.pages.pagecomponents.adduserpage.SearchComponent;

public class SystemUsersPage {
    private final SearchComponent searchComponent;
    private final AddUserComponent addUserComponent;

    public AddUserComponent getAddUserComponent() {
        return addUserComponent;
    }

    public SystemUsersPage(){
        this.addUserComponent=new AddUserComponent();
        this.searchComponent=new SearchComponent();
    }
}
