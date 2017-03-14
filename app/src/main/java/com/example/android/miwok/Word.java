package com.example.android.miwok;

/**
 * Created by boss on 11/02/17.
 */

public class Word {

    private String defaultTranslation;
    private String miwokTranslation;

    public Word(String miwokTranslation, String defaultTranslation){
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
    }

    public String getDefaultTranslation(){
        return this.defaultTranslation;
    }

    public String getMiwokTranslation(){
        return this.miwokTranslation;
    }
}
