package OrderService.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import OrderService.Entity.Orders;
import OrderService.Repository.OrderRepo;

@RestController
@RequestMapping("oderController")
public class OrderController {

	@Autowired
	OrderRepo orderRepo;

	@PostMapping("saveOrder")
	public ResponseEntity<Orders> saveOrderDetails(@RequestBody Orders order) {
		Orders save = orderRepo.save(order);

		return ResponseEntity.status(HttpStatus.CREATED).body(save);
	}
	
	
	
	
	@GetMapping("orderGetByOrderId/{orderId}")
	public ResponseEntity<Optional<Orders>>  OrderGetByOrderId(@PathVariable Long orderId)
	{
		Optional<Orders> order = orderRepo.findById(orderId);
		return ResponseEntity.ok(order);
	}

	
	
}
