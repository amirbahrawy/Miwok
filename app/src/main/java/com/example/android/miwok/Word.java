package com.example.android.miwok;

/**
 * Created by Amir on 30/04/2018.
 */

public class Word {
    // default translation for the word
    private String mDefaultTranslation;
    // miwok translation for the word
    private String mMiowkTranslation;
    // this variable for Image Resorce
    private int imageResourceId=NO_IMAGE_PROVIDED;
    // this variable to test code if have image or not
    private static final int NO_IMAGE_PROVIDED=-1;
    // the same constractor but to phrases only as it havent image
    public  Word(String a, String b){
        mDefaultTranslation=a;
        mMiowkTranslation=b;

    }
    // string a for the default and b for the miowk word and c for image id to numbers and colors and familes
     public Word(String a, String b,int c){
         mDefaultTranslation=a;
         mMiowkTranslation=b;
         imageResourceId=c;
     }
     // to get default translation
     public String  getDefaultTranslation(){
         return mDefaultTranslation;
     }
// to get miowk translation
    public String getmMiowkTranslation(){
         return mMiowkTranslation;
    }
//to get image id
    public int getImageResourceId(){
    return imageResourceId;
    }
    public boolean getImage(){
     return imageResourceId!=NO_IMAGE_PROVIDED;

    }


}
