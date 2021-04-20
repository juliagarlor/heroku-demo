package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.PATCH})
public class GreetingController {

    @Autowired
    private GreetingRepository greetingRepository;

//    Vemos qué hay en la base de datos
    @GetMapping("/greetings")
    @ResponseStatus(HttpStatus.OK)
    public List<Greeting> getAllGreetings(){
//        Sé que esto es muy feo, lo siento
        return greetingRepository.findAll();
    }

    @PostMapping("/greeting")
    @ResponseStatus(HttpStatus.CREATED)
    public Greeting newGreeting(@RequestBody String greeting){
//        Niños, no hagais esto en casa. Usad services y DTOs 😈
        Greeting newHoli = new Greeting(greeting);
        return greetingRepository.save(newHoli);
    }
}
