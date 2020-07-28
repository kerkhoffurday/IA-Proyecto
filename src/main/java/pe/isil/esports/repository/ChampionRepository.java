package pe.isil.esports.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.esports.entity.Champion;

@Repository
public interface ChampionRepository extends JpaRepository<Champion, Long> {
}
