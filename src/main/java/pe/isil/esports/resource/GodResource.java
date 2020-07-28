package pe.isil.esports.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.isil.esports.entity.God;
import pe.isil.esports.service.GodService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GodResource {

    @Autowired
    GodService service;

    @GetMapping("/smite")
    public ResponseEntity getAll() {
        List<God> gods = service.getAll();

        if (gods == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity(gods, HttpStatus.OK);
    }

    @PostMapping("/smite")
    public ResponseEntity create(@RequestBody God god) {
        service.create(god);

        return new ResponseEntity(god, HttpStatus.CREATED);
    }

    @PostMapping("/smite/all")
    public ResponseEntity createAll(@RequestBody List<God> gods) {
        service.createAll(gods);

        return new ResponseEntity(gods, HttpStatus.CREATED);
    }

    @PutMapping("/smite/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody God god) {
        God current = service.findById(id);

        if (current == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        god.setId(id);
        service.update(god);

        return new ResponseEntity(god, HttpStatus.OK);
    }

    @DeleteMapping("/smite/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        God current = service.findById(id);

        if (current == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        service.delete(current);

        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/smite/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        God god = service.findById(id);

        if (god == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(god, HttpStatus.OK);
    }
}
