package application.springbootworkshop.repositories;

import application.springbootworkshop.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
