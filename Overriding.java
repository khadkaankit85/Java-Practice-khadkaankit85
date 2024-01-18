class Overriding {
  public static void main(String[] args) {
    Animal cat = new Cat();
    Animal dog = new Dog();
    cat.makeSound();
    dog.makeSound();
  }
}

class Animal {
  public void makeSound() {
    System.out.println("Makes sound.");
  }
}

class Cat extends Animal {
  public void makeSound() {
    System.out.println("Meow!");
  }
}

class Dog extends Animal {
  public void makeSound() {
    System.out.println("Woof!");
  }
}