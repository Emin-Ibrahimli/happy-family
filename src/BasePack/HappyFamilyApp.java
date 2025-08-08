package BasePack;

public class HappyFamilyApp {
    public static void main(String[] args) {

        Human father = new Human("John", "Smith", 1990);
        Human mother = new Human("Anna", "Smith", 1995);

        Family family = new Family(father, mother);

        Human child = new Human("Mike", "Smith", 2020);
        Human child2 = new Human("John", "Smith", 2021);

        family.addChild(child);
        family.addChild(child2);
        System.out.println(family.toString());


        System.out.println("Family count: " + family.countFamily());
    }
}
