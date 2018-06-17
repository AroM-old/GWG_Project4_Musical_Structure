package com.example.android.gwg_project4_musical;

/**
 * {@link Songs} represents a list of songs.
 * It contains resource IDs for the artist name, tracks, album, gender and
 * album image file for that song.
 */

public class Songs {

    /** String resource ID for artist name */
    private String ArtistName;

    /** String resource ID for albums name */
    private String AlbumsName;

    /** String resource ID for tracks name */
    private String TracksName;

    /** String resource ID for gender name */
    private  String SongGenre;

    /** String resource ID for albums images name */
    private int ImageResId;

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
        ArtistName = Artist;
        TracksName = Tracks;
        AlbumsName = Albums;
        SongGenre = Gender;
        this.ImageResId = ImageResId;
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
        TracksName = Tracks;
        AlbumsName = Albums;
        SongGenre = Gender;
        this.ImageResId = ImageResId;
    }

    /**
     * Create a new Songs object.
     *
     * @param Albums is the string resource ID for the album's name.
     * @param Gender is the string resource ID for the music gender.
     * @param ImageResId is the drawable resource ID for the album's cover.
     */
    public Songs(String Albums, String Gender, int ImageResId){
        AlbumsName = Albums;
        SongGenre = Gender;
        this.ImageResId = ImageResId;
    }

    /**
     * Create a new Songs object.
     *
     * @param Gender is the string resource ID for the music gender.
     * @param ImageResId is the drawable resource ID for the album's cover.
     */
    public Songs(String Gender, int ImageResId){
        SongGenre = Gender;
        this.ImageResId = ImageResId;
    }

    /**
     * Get the string resource ID for the artist's name
     */
    public String getArtist() {
        return ArtistName;
    }

    /**
     * Get the string resource ID for the Album's name
     */
    public String getAlbums() {
        return AlbumsName;
    }

    /**
     * Get the string resource ID for the Track's name
     */
    public String getTracks() {
        return TracksName;
    }

    /**
     * Get the string resource ID for the Gender's name
     */
    public String getGender() {
        return SongGenre;
    }

    /**
     * Get the drawable resource ID for the album's cover
     */
    public int getImageResId() {
        return ImageResId;
    }
}
