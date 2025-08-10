package BasePack;

public class RoboCat extends Pet {

    public RoboCat() {
        super();
        setSpecies(Species.ROBO_CAT);
    }

    public RoboCat(String nickname) {
        super(nickname);
        setSpecies(Species.ROBO_CAT);
    }

    public RoboCat(String nickName, int age, int trickLevel, String[] habits) {
        super(nickName, age, trickLevel, habits);
        setSpecies(Species.ROBO_CAT);
    }

    @Override
    public void respond() {
        System.out.println("Beep! RoboCat is responding with mechanical sounds...");
    }
}
