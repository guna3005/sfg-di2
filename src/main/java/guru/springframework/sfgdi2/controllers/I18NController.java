package guru.springframework.sfgdi2.controllers;

import guru.springframework.sfgdi2.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller

public class I18NController {

//    @Qualifier("I18N")
//    @Autowired
    private GreetingService greetingService;

    public I18NController(@Qualifier("I18N") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
       return  greetingService.sayGreeting();
    }
}
