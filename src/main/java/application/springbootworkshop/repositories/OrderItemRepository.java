package application.springbootworkshop.repositories;

import application.springbootworkshop.entities.OrderItem;
import application.springbootworkshop.entities.pk.OrderItemPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
