package guru.springframework.sfgdi2.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello World English in I18N english service";
    }
}
