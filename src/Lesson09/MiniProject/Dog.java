package Lesson09.MiniProject;

/*
 * Subclass: Dog
 * Inherits from Pet
 */
public class Dog extends Pet {

    public Dog(String name) {
        super(name); // Call constructor of Pet
    }

    @Override
    public String toString() {
        return "Dog: " + getName() + " (woof woof!)";
    }
}
