package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.entity.Greeting;
import com.bridgelabz.greetingapp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    //@Autowired
    //private iGreetingService iGreetingService;

    private static String  template="Hello,%s!";
    private final  AtomicLong counter=new AtomicLong();


    @GetMapping("/home")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
//        User user = new User();
//        user.setFirstName(name);
//        return iGreetingService addGreeting(user);
        return new Greeting(counter.incrementAndGet(),String.format(template,name));

    }

}
