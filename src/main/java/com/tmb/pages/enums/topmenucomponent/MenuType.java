package com.tmb.pages.enums.topmenucomponent;

public enum MenuType {
    ADMIN("Admin"),
    PIM("pim"),
    LEAVE("Leave"),
    TIME("Time");

    private final String name;

    public String getName(){
        return name;
    }

    MenuType(String name){
        this.name=name;
    }
}
