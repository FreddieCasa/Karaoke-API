package lt.techin.springtestgp.controller;

import lombok.RequiredArgsConstructor;
import lt.techin.springtestgp.persistence.FavoritesRepository;
import lt.techin.springtestgp.persistence.model.UserRecord;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/favorites")
@RequiredArgsConstructor
public class FavoritesController {

    private final FavoritesRepository repository;



    @GetMapping
    public List<UserRecord> getAllRecords(@RequestParam String id) {
        return repository.findAll();
    }

    @DeleteMapping
    public void deleteRecord(
            @RequestParam String id
            ) {

        repository.deleteById(id);
    }

    @PostMapping
    public void editRecord(
            @RequestParam String id,
            @RequestBody UserRecord userRecord
    ) {
        repository.save(userRecord);
    }

}

