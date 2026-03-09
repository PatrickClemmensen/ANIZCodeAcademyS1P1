package Lesson17.GuineaFarm.model;

public class GuineaPig {

    private String name;
    private int age;
    private double weight;
    private Breed breed;
    private Color color;

    public GuineaPig(String name, int age, double weight, Breed breed, Color color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public Breed getBreed() {
        return breed;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {

        return name +
                " | age: " + age +
                " | weight: " + weight +
                " | breed: " + breed +
                " | color: " + color;
    }
}