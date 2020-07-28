package pe.isil.esports.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.esports.entity.Champion;
import pe.isil.esports.repository.ChampionRepository;

import java.util.List;

@Service
public class ChampionService {

    @Autowired
    private ChampionRepository repository;

    public List<Champion> getAll() {
        return repository.findAll();
    }

    public void create(Champion champion) {
        repository.save(champion);
    }

    public void createAll(List<Champion> champions) {
        repository.saveAll(champions);
    }

    public void update(Champion champion) {
        repository.save(champion);
    }

    public void delete(Champion champion) {
        repository.delete(champion);
    }

    public Champion findById(Long id) {
        return repository.findById(id).orElseGet(null);
    }
}
