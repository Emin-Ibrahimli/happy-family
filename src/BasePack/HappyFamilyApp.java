package BasePack;

public class HappyFamilyApp {
    public static void main(String[] args) {

        Pet pet = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "sleep", "play"});

        Human mother = new Human("Sara", "Karleone", 1975);
        Human father = new Human("John", "Karleone", 1973);

        Human child = new Human("Michael", "Karleone", 2000, 90, pet, mother, father,
                new String[][]{
                        {"Monday", "go to gym"},
                        {"Tuesday", "play guitar"}
                });

        child.describePet();
        child.greetPet();
        child.toString();

        pet.eat();
        pet.respond();
        pet.foul();

        child.setPet(pet);
        child.setMother(mother);
        child.setFather(father);

        System.out.println(child);
    }
}
