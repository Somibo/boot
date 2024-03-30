package web.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.boot.models.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}