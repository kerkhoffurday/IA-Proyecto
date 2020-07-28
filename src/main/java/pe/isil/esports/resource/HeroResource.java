package pe.isil.esports.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.isil.esports.entity.Hero;
import pe.isil.esports.service.HeroService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HeroResource {

    @Autowired
    HeroService service;

    @GetMapping("/dota")
    public ResponseEntity getAll() {
        List<Hero> heroes = service.getAll();

        if (heroes == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity(heroes, HttpStatus.OK);
    }

    @PostMapping("/dota")
    public ResponseEntity create(@RequestBody Hero hero) {
        service.create(hero);

        return new ResponseEntity(hero, HttpStatus.CREATED);
    }

    @PostMapping("/dota/all")
    public ResponseEntity createAll(@RequestBody List<Hero> heroes) {
        service.createAll(heroes);

        return new ResponseEntity(heroes, HttpStatus.CREATED);
    }

    @PutMapping("/dota/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Hero hero) {
        Hero current = service.findById(id);

        if (current == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        hero.setId(id);
        service.update(hero);

        return new ResponseEntity(hero, HttpStatus.OK);
    }

    @DeleteMapping("/dota/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        Hero current = service.findById(id);

        if (current == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        service.delete(current);

        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/dota/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        Hero hero = service.findById(id);

        if (hero == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(hero, HttpStatus.OK);
    }
}
