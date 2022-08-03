package day48_Abstraction.AnimalTask;

public abstract class Animal {

    public String name, breed;
    public String gender;
    public int age;

    public Animal(String name, String breed, String gender, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
    }

    public abstract void sleep();
    //public abstract void hunt();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
