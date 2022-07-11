package day42_Inheritance.AnimalTask;

public class Zoo { // Zoo HAS A Tiger

    public static void main(String[] args) {

        Tiger tiger = new Tiger("Sher Khan","Bengal Tiger",'M',5,"Orange","Large");
        System.out.println(tiger);
        tiger.eat("chicken");
        tiger.drink("water");
        //tiger.barking(); // it is not coming from Animal class
        // we extends Animal class
        tiger.hunt();
        tiger.roar();

        System.out.println("==========================================");

        Dog dog = new Dog("Karabas","Setter",'M',3,"White-Black","medium");
        System.out.println(dog);
        dog.barking();
        dog.sleep();
        dog.eat("mama");

        System.out.println("==========================================");

        Cat cat = new Cat("Sinba","regular",'F',1,"Gray","small");
        System.out.println(cat);
        cat.meoww();
        cat.drink("water");
    }

}
