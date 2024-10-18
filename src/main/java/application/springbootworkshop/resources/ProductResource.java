package application.springbootworkshop.resources;


import application.springbootworkshop.Services.ProductServices;
import application.springbootworkshop.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductServices us;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> prodList = us.findAll();
        return ResponseEntity.ok().body(prodList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(us.findById(id));
    }


}
