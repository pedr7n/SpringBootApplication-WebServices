package com.pedrosouza.springLearning.config;

import com.pedrosouza.springLearning.entities.User;
import com.pedrosouza.springLearning.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String ...args) throws Exception {
        User u1 = new User (null, "Arnaldo", "arnaldo@gmail.com", "23213213", "SenhaLegal");
        User u2 = new User(null, "Roberto", "roberto@gmail.com", "21232321", "SenhaDaora");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}