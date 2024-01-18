package lt.techin.springtestgp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


public class Song {

    private long id;

//    private User user;
    private  String artist;
    private  String title;

    public Song(String artist, String song) {
        this.artist = artist;
        this.title = song;
    }

    public String getArtist() {
        return artist;
    }

    public String getSong() {
        return title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSong(String song) {
        this.title = song;
    }
}
