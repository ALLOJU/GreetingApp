package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.entity.Greeting;
import com.bridgelabz.greetingapp.entity.User;

import java.util.List;

public interface IGreetingService {
    Greeting addGreeting(User user);

    Greeting getGreetingByID(long id);

    List<Greeting> getAll();

    Greeting updateGreeting(Greeting greeting);

    void delete(long id);
}
