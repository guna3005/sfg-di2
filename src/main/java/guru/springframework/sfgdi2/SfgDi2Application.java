package guru.springframework.sfgdi2;

import guru.springframework.sfgdi2.controllers.*;
import guru.springframework.sfgdi2.pets.PetServiceFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDi2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDi2Application.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		I18NController i18NController = (I18NController)  ctx.getBean("i18NController");

		System.out.println(i18NController.sayHello());

		PetServiceFactory petServiceFactory = (PetServiceFactory) ctx.getBean("petServiceFactory") ;

		System.out.println(petServiceFactory.getPetService("dog").getPetName());
		System.out.println(petServiceFactory.getPetService("cat").getPetName());


		System.out.println(myController.sayHello());

		System.out.println("----- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		SetterInjectedController setterInjectedController = (SetterInjectedController)  ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting() );

	}


}
