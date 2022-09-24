package guru.springframework.sfgdi2.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("English")
@Service("I18N")

public class I18NEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World English in I18N english service";
    }
}
