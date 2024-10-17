package application.springbootworkshop.resources;


import application.springbootworkshop.Services.OrderServices;
import application.springbootworkshop.entities.Order;
import application.springbootworkshop.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderServices us;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        List<Order> lstOrders = us.findAll();
        return ResponseEntity.ok().body(lstOrders);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(us.findById(id));
    }


}
