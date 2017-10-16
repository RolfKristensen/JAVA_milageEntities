package dk.lightsaber.milage.server.pdo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dk.lightsaber.milage.server.pdo.model.UserPdo;

@Repository
public interface IUserJpaRepository extends JpaRepository<UserPdo, Long> {

}
