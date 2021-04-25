package com.edge.edge.controller;

import com.edge.edge.client.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.PATCH})
public class Controller {

    @Autowired
    private BackendClient backendClient;

    @GetMapping("/greetings")
    @ResponseStatus(HttpStatus.OK)
    public List<Object> getAllGreetings(){
        return backendClient.getAllGreetings();
    }

    @PostMapping("/greeting")
    @ResponseStatus(HttpStatus.CREATED)
    public Object newGreeting(@RequestBody String greeting){
        return backendClient.newGreeting(greeting);
    }
}
