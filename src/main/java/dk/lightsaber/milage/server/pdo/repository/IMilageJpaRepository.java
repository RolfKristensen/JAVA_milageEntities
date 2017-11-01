package dk.lightsaber.milage.server.pdo.repository;

import dk.lightsaber.milage.server.pdo.model.MilagePdo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMilageJpaRepository extends JpaRepository<MilagePdo, Long> {
}
