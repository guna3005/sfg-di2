package guru.springframework.sfgdi2.pets;

public class CatPetService implements PetService{

    @Override
    public String getPetName() {
        return "cats are the best";
    }
}
