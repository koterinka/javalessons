package ru.Animals;

public abstract class Animal {
    public void Make_noise (){};
    abstract boolean Move ();
    abstract boolean Eat ();
    abstract boolean Climb_trees ();
    abstract boolean Swim ();

    private String name;
    private int age;
    private String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public String getColor() {return color;}

}