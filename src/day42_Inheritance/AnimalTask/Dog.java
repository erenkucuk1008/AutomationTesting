package day42_Inheritance.AnimalTask;

public class Dog extends Animal{

    public Dog(String name, String breed, char gender, int age, String color, String size) {
        setInfo(name, breed, gender, age, color, size);
    }

    public void barking(){
        System.out.println(name+" is barking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
