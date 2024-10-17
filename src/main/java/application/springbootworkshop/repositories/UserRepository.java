package application.springbootworkshop.repositories;

import application.springbootworkshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
