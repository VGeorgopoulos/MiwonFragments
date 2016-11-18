package com.example.android.miwonfragments;

/**
 * Created by neuromancer on 14/11/2016.
 */

public class Word {


    /**
     * represents a vocabulary word that the user wants to learn.
     * It contains a default translation and a Miwok translation for the word.
     */

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;
    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;
    /**
     * Audio resource ID for the word
     */
    private int mAudioResourceId;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * @param miwokTranslation
     * @param defaultTranslation
     */
    public Word(String miwokTranslation, String defaultTranslation, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * @param imageResourceId
     * @param miwokTranslation   Parameter for the Miwok language
     * @param defaultTranslation
     */
    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * @return The Audio resourse id of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    /**
     * @return The image Resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * @return The miwok translation of the word
     */
    public String getMiwokTranslation() {

        return mMiwokTranslation;
    }

    /**
     * @return The default translation for the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
