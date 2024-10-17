package application.springbootworkshop.resources;


import application.springbootworkshop.Services.UserServices;
import application.springbootworkshop.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserServices us;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> lstUsers = us.findAll();
        return ResponseEntity.ok().body(lstUsers);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(us.findById(id));
    }


}
