package com.example.android.miwok;

/**
 * Created by boss on 11/02/17.
 */

public class Word {

    private String defaultTranslation;

    /** Translation from english to miwok of the current word */
    private String miwokTranslation;

    /** Image resource ID for the word */
    private int mImageResourceID;

    private boolean imagePresence = false;

    public Word(String miwokTranslation, String defaultTranslation){
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imagePresence = false;
    }

    public Word(String miwokTranslation, String defaultTranslation, int mImageResourceID){
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.mImageResourceID = mImageResourceID;
        this.imagePresence = true;
    }

    /**
     * Returns wether or not this word has an image
     * @return
     */
    public boolean hasImage() { return this.imagePresence; }

    /**
     * Returns default translation in english of this word
     * @return
     */
    public String getDefaultTranslation(){
        return this.defaultTranslation;
    }

    /**
     * Returns the miwok translation of this word
     */
    public String getMiwokTranslation(){
        return this.miwokTranslation;
    }

    /**
     * Returns the image ID of the image associated with this word
     * @return
     */
    public int getImageResourceID() { return this.mImageResourceID; }
}
