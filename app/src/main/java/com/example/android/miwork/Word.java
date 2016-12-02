package com.example.android.miwork;

/**
 * Created by User7 on 2016/11/30.
 */
public class Word {

    /** Default translation for the word*/
    private String mDefaultTranslation;

    /** Miwork translation for the word*/
    private String mPediTranslation;

    /** Pedi translation for the word*/
    private String mMiwokTranslation;

    /** Audio translation for the word*/
    private String mAudioTranslation;


    private int mImageResouceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word (String defaultTranslation, String miwokTranslation, String pediTranslation){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mPediTranslation = pediTranslation;


    }

    public Word (String defaultTranslation, String miwokTranslation, String pediTranslation, int imageResouceId){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mPediTranslation = pediTranslation;
        mImageResouceId = imageResouceId;

    }

    /** Get the default translation of the word
     */
    public String getDefaultTranslation(){

        return mDefaultTranslation;

    }

    /** Get miwok transaltion
     */
    public String getmMiwokTranslation(){

        return mMiwokTranslation;
    }

    /** Get Pedi transaltion
     */
    public String getmPediTranslation(){

        return mPediTranslation;
    }


    /** Get drawable image assets
     */
    public int getmImageResouceId() {
        return mImageResouceId;
    }

    //Return werther or not there is an image
    public boolean hasImage(){

        return mImageResouceId != NO_IMAGE_PROVIDED;

    }
}
