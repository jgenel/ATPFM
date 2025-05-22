package com.jgenel.automation.enums;

public enum Gender {
    MALE("id_gender1"),
    FEMALE("id_gender2");

    private final String genderId;

    Gender(String genderId) {
        this.genderId = genderId;
    }

    public String getGenderId() {
        return genderId;
    }
}
