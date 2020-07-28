package pe.isil.esports.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.isil.esports.entity.Champion;
import pe.isil.esports.service.ChampionService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChampionResource {

    @Autowired
    ChampionService service;

    @GetMapping("/lol")
    public ResponseEntity getAll() {
        List<Champion> champions = service.getAll();

        if (champions == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity(champions, HttpStatus.OK);
    }

    @PostMapping("/lol")
    public ResponseEntity create(@RequestBody Champion champion) {
        service.create(champion);

        return new ResponseEntity(champion, HttpStatus.CREATED);
    }

    @PostMapping("/lol/all")
    public ResponseEntity createAll(@RequestBody List<Champion> champions) {
        service.createAll(champions);

        return new ResponseEntity(champions, HttpStatus.CREATED);
    }

    @PutMapping("/lol/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Champion champion) {
        Champion current = service.findById(id);

        if (current == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        champion.setId(id);
        service.update(champion);

        return new ResponseEntity(champion, HttpStatus.OK);
    }

    @DeleteMapping("/lol/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        Champion current = service.findById(id);

        if (current == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        service.delete(current);

        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/lol/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        Champion champion = service.findById(id);

        if (champion == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(champion, HttpStatus.OK);
    }
}
