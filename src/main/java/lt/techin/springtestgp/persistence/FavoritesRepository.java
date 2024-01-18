package lt.techin.springtestgp.persistence;

import lt.techin.springtestgp.persistence.model.UserRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoritesRepository extends JpaRepository<UserRecord, String> {

}
