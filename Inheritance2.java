// Superclass
class Animal {
  // Protected instance variables
  protected String name;
  protected int age;

  // Constructor
  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Public methods
  public void eat() {
    System.out.println(name + " is eating.");
  }

  public void sleep() {
    System.out.println(name + " is sleeping.");
  }
}

// Subclass
class Dog extends Animal {
  // Private instance variable
  private String breed;

  // Constructor
  public Dog(String name, int age, String breed) {
    // Call superclass constructor
    super(name, age);
    this.breed = breed;
  }

  // Public method
  public void bark() {
    System.out.println(name + " is barking.");
  }
}

// Subclass
class Cat extends Animal {
  // Private instance variable
  private String furColor;

  // Constructor
  public Cat(String name, int age, String furColor) {
    // Call superclass constructor
    super(name, age);
    this.furColor = furColor;
  }

  // Public method
  public void meow() {
    System.out.println(name + " is meowing.");
  }
}

// Main class
public class Main {
  public static void main(String[] args) {
    // Create dog object
    Dog dog = new Dog("Buddy", 5, "Labrador");
    dog.eat();
    dog.sleep();
    dog.bark();

    // Create cat object
    Cat cat = new Cat("Fluffy", 3, "White");
    cat.eat();
    cat.sleep();
    cat.meow();
  }
}
