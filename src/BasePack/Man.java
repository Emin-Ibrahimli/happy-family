package BasePack;

public final class Man extends Human {

    public Man() {
        super();
    }

    public Man(String name, String surname, int dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public Man(String name, String surname, int dateOfBirth, int iq, String[][] schedule) {
        super(name, surname, dateOfBirth, iq, schedule);
    }

    public Man(String name, String surname, int dateOfBirth, int iq, String[][] schedule, Family family) {
        super(name, surname, dateOfBirth, iq, schedule, family);
    }

    @Override
    public void greetPet() {
        System.out.println("Hey buddy! How's it going, " + getFamily().getPet().getNickName() + "?");
    }

    public void repairCar() {
        System.out.println("Man is repairing the car...");
    }
} 