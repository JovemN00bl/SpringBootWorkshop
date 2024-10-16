package application.springbootworkshop.resources;


import application.springbootworkshop.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "maria", "maria@gmail.com", "111111111", "maria1234");
        return ResponseEntity.ok().body(u);
    }


}
