package BasePack;

public class Dog extends Pet implements Foulable {

    public Dog() {
        super();
        setSpecies(Species.DOG);
    }

    public Dog(String nickname) {
        super(nickname);
        setSpecies(Species.DOG);
    }

    public Dog(String nickName, int age, int trickLevel, String[] habits) {
        super(nickName, age, trickLevel, habits);
        setSpecies(Species.DOG);
    }

    @Override
    public void respond() {
        System.out.println("Woof! Dog is responding...");
    }

    @Override
    public void foul() {
        System.out.println("Dog is making a mess...");
    }
}
