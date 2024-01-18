package lt.techin.springtestgp.persistence.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserRecord {

    @Id
    private String id;

    private String userName;

    private String artist;

    private String title;
}
