package guru.springframework.sfgdi2.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("Spanish")
@Service("I18N")

public class I18NSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World Spanish";
    }
}
