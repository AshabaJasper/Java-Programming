class Animal {
  protected String name;
  protected int age;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void eat() {
    System.out.println(name + " is eating.");
  }

  public void sleep() {
    System.out.println(name + " is sleeping.");
  }
}

class Dog extends Animal {
  private String breed;

  public Dog(String name, int age, String breed) {
    super(name, age);
    this.breed = breed;
  }

  public void bark() {
    System.out.println(name + " is barking.");
  }
}

class Cat extends Animal {
  private String furColor;

  public Cat(String name, int age, String furColor) {
    super(name, age);
    this.furColor = furColor;
  }

  public void meow() {
    System.out.println(name + " is meowing.");
  }
}

public class Main {
  public static void main(String[] args) {
    Dog dog = new Dog("Buddy", 5, "Labrador");
    dog.eat();
    dog.sleep();
    dog.bark();

    Cat cat = new Cat("Fluffy", 3, "White");
    cat.eat();
    cat.sleep();
    cat.meow();
  }
}
