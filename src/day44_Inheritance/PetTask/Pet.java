package day44_Inheritance.PetTask;

public class Pet {

    public String name;
    public String breed;
    public char gender;
    public int age;
    public String color;

    public Pet(String name, String breed, char gender, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    protected void eat(){
        System.out.println(name+" is eating");
    }

    protected void drinl(){
        System.out.println(name+" is drinking");
    }

    protected void sleep(){
        System.out.println(name+" is sleeping");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
