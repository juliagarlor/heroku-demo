package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String greetingWords;

    public Greeting() {
    }

    public Greeting(String greetingWords) {
        this.greetingWords = greetingWords;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGreetingWords() {
        return greetingWords;
    }

    public void setGreetingWords(String greetingWords) {
        this.greetingWords = greetingWords;
    }
}
