package guru.springframework.sfgdi2.services;

import org.springframework.stereotype.Service;

public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World in english --constructor";
    }
}
