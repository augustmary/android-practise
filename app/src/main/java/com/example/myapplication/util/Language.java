package com.example.myapplication.util;

/**
 * Created by Маша on 10.01.2017.
 */
public enum Language {
    ENGLISH("ENG"),
    RUSSIAN("RUS"),
    UKRAINIAN("UKR");

    private String language;

    Language(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
