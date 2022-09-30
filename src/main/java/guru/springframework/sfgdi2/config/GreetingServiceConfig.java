package guru.springframework.sfgdi2.config;

import guru.springframework.sfgdi2.pets.PetService;
import guru.springframework.sfgdi2.pets.PetServiceFactory;
import guru.springframework.sfgdi2.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi2.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi2.services.ConstructorGreetingService;
import guru.springframework.sfgdi2.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi2.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {
    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Profile({"dog","default"})
    @Bean

    PetService dogPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("dog");
    }
    @Profile("cat")
    @Bean

    PetService catPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("cat");
    }
    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
    
}
