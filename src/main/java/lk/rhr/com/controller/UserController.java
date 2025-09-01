package lk.rhr.com.controller;

import lk.rhr.com.Model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/save-user")
    public void saveUser(@RequestBody User user){

    }
}
