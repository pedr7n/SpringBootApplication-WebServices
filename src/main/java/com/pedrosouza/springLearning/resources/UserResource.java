package com.pedrosouza.springLearning.resources;

import com.pedrosouza.springLearning.entities.User;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {


    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "randomName", "randomMail", "111111111", "randomPass111");
        return ResponseEntity.ok().body(user);
    }
}