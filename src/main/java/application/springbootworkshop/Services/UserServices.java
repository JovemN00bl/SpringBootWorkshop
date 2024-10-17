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



}
