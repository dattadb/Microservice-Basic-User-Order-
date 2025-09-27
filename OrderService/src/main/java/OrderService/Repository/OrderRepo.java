package OrderService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import OrderService.Entity.Orders;

@Repository
public interface OrderRepo   extends JpaRepository<Orders, Long>{

}
