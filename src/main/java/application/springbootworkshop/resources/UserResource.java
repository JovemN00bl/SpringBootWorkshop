package application.springbootworkshop.resources;


import application.springbootworkshop.Services.UserServices;
import application.springbootworkshop.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User userObj){
        User obj = us.insert(userObj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        us.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User userObj){
        userObj = us.update(id, userObj);
        return ResponseEntity.ok().body(userObj);
    }



}
