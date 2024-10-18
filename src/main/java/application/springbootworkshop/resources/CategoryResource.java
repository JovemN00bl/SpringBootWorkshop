package application.springbootworkshop.resources;


import application.springbootworkshop.Services.CategoryServices;
import application.springbootworkshop.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryServices us;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> lst = us.findAll();
        return ResponseEntity.ok().body(lst);
    }

    @GetMapping("{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(us.findById(id));
    }









}

