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
    private String[][] schedule;

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

    public Human(String name, String surname, int age, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.println("Hello, " + pet.getNickName());
    }

    public void describePet() {
        System.out.printf("I have an %s is %d years old, he is %s", pet.getSpecies(), pet.getAge(), pet.getTrickLevel() > 50 ? "very sly" : "almost not sly");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + dateOfBirth +
                ", iq=" + iq +
                ", pet=" + (pet != null ? pet.getNickName() : "null") +
                ", mother=" + (mother != null ? mother.name + mother.surname : "null") +
                ", father=" + (father != null ? father.name + father.surname : "null") +
                ", schedule=" + (schedule != null ? Arrays.deepToString(schedule) : "null") +
                '}';
    }
}
