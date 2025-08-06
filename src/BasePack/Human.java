package BasePack;

import java.util.Arrays;

public class Human {

    private String name;
    private String surname;
    private int dateOfBirth;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private Stirng[][] schedule;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = age;
    }

    public Human(String name, String surname, int age, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = age;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int age, int iq, Pet pet, Human mother, Human father, Stirng[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = age;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human() {
    }

    public void greetPet(){
        System.out.println("Hello, " + pet.getNickName);
    }

    public void discribePet(){
        System.out.printf("I have an %s is %d years old",  pet.getSpecies, pet.getAge,pet.getIq > 50 ?  "very sly" : "almost not sly");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + dateOfBirth +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}
