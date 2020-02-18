package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
@RequestMapping("/api")
public class UserController {

    @PostMapping("/user")
    public void createUser( @RequestBody User user) throws IOException {

        String userAux = user.getUserId();
        //some complex code here
        URL url = new URL(userAux);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    }
}