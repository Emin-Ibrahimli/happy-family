package BasePack;

public class DomesticCat extends Pet implements Foulable {

    public DomesticCat() {
        super();
        setSpecies(Species.DOMESTIC_CAT);
    }

    public DomesticCat(String nickname) {
        super(nickname);
        setSpecies(Species.DOMESTIC_CAT);
    }

    public DomesticCat(String nickName, int age, int trickLevel, String[] habits) {
        super(nickName, age, trickLevel, habits);
        setSpecies(Species.DOMESTIC_CAT);
    }

    @Override
    public void respond() {
        System.out.println("Meow! Domestic cat is responding...");
    }

    @Override
    public void foul() {
        System.out.println("Domestic cat is making a mess...");
    }
}
