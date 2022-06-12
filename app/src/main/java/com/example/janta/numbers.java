package com.example.janta;

public class numbers {
    private int mHelpImage = No_Image;
    private static final int No_Image = -1;
    private String mHelpLineNo;

    public numbers(int image,String number){
        mHelpImage=image;
        mHelpLineNo=number;
    }
    public int getHelpImage(){
        return mHelpImage;
    }
    public String getHelpLineNo(){
        return mHelpLineNo;
    }

    public boolean hasImage() {
        return mHelpImage != No_Image;
    }
}
