package com.example.android.gwg_project4_musical;

/**
 * {@link Songs} represents a list of songs.
 * It contains resource IDs for the artist name, tracks, album, gender and
 * album image file for that song.
 */

public class Songs {

    /** String resource ID for artist name */
    private String mArtist;

    /** String resource ID for albums name */
    private String mAlbums;

    /** String resource ID for tracks name */
    private String mTracks;

    /** String resource ID for gender name */
    private  String mGender;

    /** String resource ID for albums images name */
    private int mImageResId;

    /**
     * Create a new Songs object.
     *
     * @param Artist is the string resource ID for the artist's name.
     * @param Tracks is the string resource Id for the track's name.
     * @param Albums is the string resource ID for the album's name.
     * @param Gender is the string resource ID for the music gender.
     * @param ImageResId is the drawable resource ID for the album's cover.
     */
    public Songs(String Artist,  String Tracks, String Albums, String Gender, int ImageResId){
        mArtist = Artist;
        mTracks = Tracks;
        mAlbums = Albums;
        mGender = Gender;
        mImageResId = ImageResId;
    }

    /**
     * Create a new Songs object.
     *
     * @param Tracks is the string resource Id for the track's name.
     * @param Albums is the string resource ID for the album's name.
     * @param Gender is the string resource ID for the music gender.
     * @param ImageResId is the drawable resource ID for the album's cover.
     */
    public Songs(String Tracks, String Albums, String Gender, int ImageResId){
        mTracks = Tracks;
        mAlbums = Albums;
        mGender = Gender;
        mImageResId = ImageResId;
    }

    /**
     * Create a new Songs object.
     *
     * @param Albums is the string resource ID for the album's name.
     * @param Gender is the string resource ID for the music gender.
     * @param ImageResId is the drawable resource ID for the album's cover.
     */
    public Songs(String Albums, String Gender, int ImageResId){
        mAlbums = Albums;
        mGender = Gender;
        mImageResId = ImageResId;
    }

    /**
     * Create a new Songs object.
     *
     * @param Gender is the string resource ID for the music gender.
     * @param ImageResId is the drawable resource ID for the album's cover.
     */
    public Songs(String Gender, int ImageResId){
        mGender = Gender;
        mImageResId = ImageResId;
    }

    /**
     * Get the string resource ID for the artist's name
     */
    public String getArtist() {
        return mArtist;
    }

    /**
     * Get the string resource ID for the Album's name
     */
    public String getAlbums() {
        return mAlbums;
    }

    /**
     * Get the string resource ID for the Track's name
     */
    public String getTracks() {
        return mTracks;
    }

    /**
     * Get the string resource ID for the Gender's name
     */
    public String getGender() {
        return mGender;
    }

    /**
     * Get the drawable resource ID for the album's cover
     */
    public int getImageResId() {
        return mImageResId;
    }
}
