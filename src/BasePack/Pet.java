package BasePack;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private Species specie;
    private String nickName;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet() {
    }

    public Pet(Species specie, String nickname) {
        this.specie = specie;
        this.nickName = nickname;
    }

    public Pet(Species specie, String nickName, int age, int trickLevel, String[] habits) {
        this.specie = specie;
        this.nickName = nickName;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Species getSpecies() {
        return specie;
    }

    public void setSpecies(Species specie) {
        this.specie = specie;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickname(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat() {
        System.out.println("Pet eating");
    }

    public void respond() {
        System.out.printf("Hello owner. i am - %s.I miss you", nickName);
        System.out.println();
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Removing Pet object");
        } finally {
            super.finalize();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && trickLevel == pet.trickLevel && Objects.equals(specie, pet.specie) && Objects.equals(nickName, pet.nickName) && Objects.deepEquals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specie, nickName, age, trickLevel, Arrays.hashCode(habits));
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + specie + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
