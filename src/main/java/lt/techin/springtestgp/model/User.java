package lt.techin.springtestgp.model;


import java.util.ArrayList;
import java.util.UUID;

public class User {

    private final UUID userID;
    private String username;
    private ArrayList<Song> Songs;


    public User(UUID userID, String username, ArrayList<Song> songs) {
        this.userID = userID;
        this.username = username;
        Songs = songs;
    }


}
