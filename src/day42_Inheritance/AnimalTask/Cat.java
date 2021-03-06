package day42_Inheritance.AnimalTask;

public class Cat extends Animal{ // Cat IS A Animal

    public Cat(String name, String breed, char gender, int age, String color, String size) {
        setInfo(name, breed, gender, age, color, size);
    }

    public void meoww(){
        System.out.println(name+" is meowing");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
