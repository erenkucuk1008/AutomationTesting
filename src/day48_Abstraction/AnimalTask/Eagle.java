package day48_Abstraction.AnimalTask;

public final class Eagle extends Animal implements Predator,Flyable{

    public Eagle(String name, String breed, String gender, int age) {
        super(name, breed, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Eagle sleeps 6 hours");
    }

    @Override
    public void fly() {
        System.out.println("Eagles can fly long hours");
    }

    @Override
    public void hunt() {
        System.out.println("Eagle hunts snake");
    }
}
