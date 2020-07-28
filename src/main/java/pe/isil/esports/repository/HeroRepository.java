package pe.isil.esports.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.esports.entity.Hero;

@Repository
public interface HeroRepository extends JpaRepository<Hero, Long> {
}
