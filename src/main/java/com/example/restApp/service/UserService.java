package com.example.restApp.service;

import com.example.restApp.API.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService(){
        userList= new ArrayList<>();

        User user1 = new User(1,"TP",27,"tp@mail.com");
        User user2 = new User(2,"KB",31,"KB@mail.com");
        User user3 = new User(3,"Perc",35,"Perc@mail.com");
        User user4 = new User(4,"Nal",25,"Nal@mail.com");
        User user5 = new User(5,"Leb",29,"Leb@mail.com");
        User user6 = new User(6,"Bon",19,"Bon@mail.com");

        userList.addAll(Arrays.asList(user1,user2, user3, user4, user5, user6));

    }

    public Optional<User> getUser(Integer id){
        Optional optional = Optional.empty();
        for (User user: userList){
            if (id == user.getId()){
                optional = optional.of(user);
                return optional;
            }
        }

        return optional;
    }
}
