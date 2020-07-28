package pe.isil.esports.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.esports.entity.Champion;
import pe.isil.esports.entity.God;
import pe.isil.esports.repository.GodRepository;

import java.util.List;

@Service
public class GodService {

    @Autowired
    private GodRepository repository;

    public List<God> getAll() {
        return repository.findAll();
    }

    public void create(God god) {
        repository.save(god);
    }

    public void createAll(List<God> gods) {
        repository.saveAll(gods);
    }

    public void update(God god) {
        repository.save(god);
    }

    public void delete(God god) {
        repository.delete(god);
    }

    public God findById(Long id) {
        return repository.findById(id).orElseGet(null);
    }
}
