package com.edge.edge.client;

import org.springframework.cloud.openfeign.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@FeignClient(name = "backend-service", url = "https://heroku-demo-backend.herokuapp.com/")
public interface BackendClient {

//    Vemos qué hay en la base de datos
    @GetMapping("/greetings")
    List<Object> getAllGreetings();

    @PostMapping("/greeting")
    Object newGreeting(@RequestBody String greeting);
}
