package pe.isil.esports.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.esports.entity.Champion;
import pe.isil.esports.entity.Hero;
import pe.isil.esports.repository.HeroRepository;

import java.util.List;

@Service
public class HeroService {

    @Autowired
    private HeroRepository repository;

    public List<Hero> getAll() {
        return repository.findAll();
    }

    public void create(Hero hero) {
        repository.save(hero);
    }

    public void createAll(List<Hero> heroes) {
        repository.saveAll(heroes);
    }

    public void update(Hero hero) {
        repository.save(hero);
    }

    public void delete(Hero hero) {
        repository.delete(hero);
    }

    public Hero findById(Long id) {
        return repository.findById(id).orElseGet(null);
    }
}
