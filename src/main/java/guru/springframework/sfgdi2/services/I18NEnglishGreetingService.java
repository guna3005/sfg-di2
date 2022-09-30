package guru.springframework.sfgdi2.services;

import guru.springframework.sfgdi2.repositories.EnglishGreetingRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("English")
@Service("I18N")

public class I18NEnglishGreetingService implements GreetingService{

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18NEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepository.getGreeting();
    }
}
