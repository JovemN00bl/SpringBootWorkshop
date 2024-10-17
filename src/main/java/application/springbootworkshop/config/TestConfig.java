package application.springbootworkshop.config;


import application.springbootworkshop.entities.Order;
import application.springbootworkshop.entities.User;
import application.springbootworkshop.repositories.OrderRepository;
import application.springbootworkshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, u1, Instant.parse("2019-06-20T19:53:07Z"));
        Order o2 = new Order(null, u2, Instant.parse("2019-07-21T03:42:10Z"));
        Order o3 = new Order(null, u1, Instant.parse("2019-07-22T15:21:22Z"));

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
