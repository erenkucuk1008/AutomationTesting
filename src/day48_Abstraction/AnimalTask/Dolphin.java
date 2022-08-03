package day48_Abstraction.AnimalTask;

public final class Dolphin extends Animal implements Swimmable, Playable{

    public Dolphin(String name, String breed, String gender, int age) {
        super(name, breed, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Dolphin sleeps 11 hours");
    }

    @Override
    public void play() {
        System.out.println("Plays with human");
    }

    @Override
    public void swim() {
        System.out.println("Dolphin can swim 10 hours");
    }
}
