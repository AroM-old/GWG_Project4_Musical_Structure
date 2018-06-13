package com.example.android.gwg_project4_musical;

public class Songs {

    private String mArtist;
    private String mAlbums;
    private String mTracks;
    private  String mGender;
    private int mImageResId;

    public Songs(String Artist,  String Tracks, String Albums, String Gender, int ImageResId){
        mArtist = Artist;
        mTracks = Tracks;
        mAlbums = Albums;
        mGender = Gender;
        mImageResId = ImageResId;
    }

    public Songs(String Tracks, String Albums, String Gender, int ImageResId){
        mTracks = Tracks;
        mAlbums = Albums;
        mGender = Gender;
        mImageResId = ImageResId;
    }

    public Songs(String Albums, String Gender, int ImageResId){
        mAlbums = Albums;
        mGender = Gender;
        mImageResId = ImageResId;
    }

    public Songs(String Gender, int ImageResId){
        mGender = Gender;
        mImageResId = ImageResId;
    }



    public String getArtist() {
        return mArtist;
    }

    public String getAlbums() {
        return mAlbums;
    }

    public String getTracks() {
        return mTracks;
    }

    public String getGender() {
        return mGender;
    }

    public int getImageResId() {
        return mImageResId;
    }
}
