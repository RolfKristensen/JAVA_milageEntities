package dk.lightsaber.milage.server.pdo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import dk.lightsaber.milage.server.pdo.model.UserPdo;

@Repository
public interface IUserJpaRepository extends JpaRepository<UserPdo, Long> {
    @Query("SELECT u FROM UserPdo u WHERE u.email = :email and u.password = :password")
    UserPdo findByUsername(@Param("email") String email, @Param("password") String password);

    @Query("SELECT u FROM UserPdo u where u.authToken = :authToken")
    UserPdo findByToken(@Param("authToken") String authToken);
}
