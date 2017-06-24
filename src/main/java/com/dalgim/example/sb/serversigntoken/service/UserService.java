package com.dalgim.example.sb.serversigntoken.service;

import com.dalgim.example.sb.serversigntoken.model.User;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mateusz Dalgiewicz on 25.06.2017.
 */
@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    @PostConstruct
    public void initUsers() {
        users.add(new User("John", "password"));
        users.add(new User("Harry", "password"));
    }

    public boolean verifyCredentials(String login, String password) {
        return users.stream()
                .filter(user -> login.equals(user.getLogin()))
                .findFirst()
                .map(user -> password.equals(user.getPassword()))
                .orElse(false);
    }
}
