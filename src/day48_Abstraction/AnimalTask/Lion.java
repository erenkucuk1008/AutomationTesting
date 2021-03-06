package day48_Abstraction.AnimalTask;

public final class Lion extends Animal implements Predator{

    public Lion(String name, String breed, String gender, int age) {
        super(name, breed, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps 10 hours.");
    }

    @Override
    public void hunt() {
        System.out.println("Lion hunts deer");
    }
}
