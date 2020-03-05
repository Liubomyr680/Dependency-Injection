package liubomyr.springframework.DependencyInjection.controllers;

import liubomyr.springframework.DependencyInjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")           // this annotation exactly tells us which been we want to inject (if we had more than 1 bean @Service)
    @Autowired                                              // they all implements one interface.
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}