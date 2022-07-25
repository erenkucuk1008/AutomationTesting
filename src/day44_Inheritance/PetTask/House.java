package day44_Inheritance.PetTask;

public class House {

    public static void main(String[] args) {

        Cat cat1 = new Cat("XYZ","hjd",'M',1,"Grey");
        System.out.println(cat1);

        Dog dog1 = new Dog("Karabas","Seter",'F',2,"Black");
        System.out.println(dog1.name);
        System.out.println(dog1);

        dog1.eat();
        cat1.sleep();
    }
}
