package com.example.springEsercizio2.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping("/factorial")
public class FactorialController {

    //prova postman

    //http://localhost:8080/factorial/ <-- " n "
    @GetMapping(value = "/factorial/{n}")
    public String getFattorialResponse(@PathVariable String n){
        return "response - " + n;
    }


    @GetMapping(value = "/factorial")
    public String getFattorial(){
        return "p" ;
    }
}
