package Lesson09.MiniProject;

import java.util.Scanner;

/*
 * Superclass: Pet
 * This is the parent class for all types of pets.
 */
public class Pet {

    // Private attribute (encapsulation!)
    private String name;

    // Constructor
    public Pet(String name) {
        this.name = name;
    }

    // Getter method (used to access private attribute)
    public String getName() {
        return name;
    }

    // Setter method (used to change name if needed)
    public void setName(String name) {
        this.name = name;
    }

    // toString method (called automatically when printing object)
    @Override
    public String toString() {
        return "Pet: " + name;
    }
}

