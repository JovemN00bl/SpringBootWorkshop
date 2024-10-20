package application.springbootworkshop.Services;

import application.springbootworkshop.entities.User;
import application.springbootworkshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;


@Service
public class UserServices {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    public User insert(User userObj){
        return repository.save(userObj);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public User update(Long id, User userObj){
        User entity = repository.getReferenceById(id);
        updateData(entity, userObj);
        return repository.save(entity);
    }

    private void updateData(User entity, User userObj){
        entity.setName(userObj.getName());
        entity.setEmail(userObj.getEmail());
        entity.setPhone(userObj.getPhone());
    }



}
