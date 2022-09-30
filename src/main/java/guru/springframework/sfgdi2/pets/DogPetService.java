package guru.springframework.sfgdi2.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile({"dog","default"})
//@Service
public class DogPetService implements PetService {
    @Override
    public String getPetName(){
        return "dogs are the best";
    }

}
