package pe.isil.esports.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.esports.entity.God;

@Repository
public interface GodRepository extends JpaRepository<God, Long> {
}
