package lt.techin.springtestgp.persistence.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@NoArgsConstructor
public class FavoriteSongsRecord {


    @Id
    private String artist;

    private String title;



}
