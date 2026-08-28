public class abstractQ {
    public static void main(String[] args) {
        Animal d = new Dog();

        d.eat();
        d.sound();
    }
}

abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}