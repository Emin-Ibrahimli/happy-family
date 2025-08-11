package BasePack;

public final class Woman extends Human {

    public Woman() {
        super();
    }

    public Woman(String name, String surname, int dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public Woman(String name, String surname, int dateOfBirth, int iq, String[][] schedule) {
        super(name, surname, dateOfBirth, iq, schedule);
    }

    public Woman(String name, String surname, int dateOfBirth, int iq, String[][] schedule, Family family) {
        super(name, surname, dateOfBirth, iq, schedule, family);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello sweetie! Come here, " + getFamily().getPet().getNickName() + "!");
    }

    public void makeup() {
        System.out.println("Woman is applying makeup...");
    }
} 