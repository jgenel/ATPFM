package com.jgenel.automation.enums;

public enum Country {

    // Countries
    INDIA("India"), 
    USA("United States"), 
    CANADA("Canada"), 
    AUSTRALIA("Australia"), 
    ISRAEL("Israel"), 
    NEWZEALAND("New Zealand"), 
    SIGNAPORE("Signapore");

    private final String country;

    Country(String country) {
        this.country = country;
    }

    public String getCountry(){
        return country;
    }

}
