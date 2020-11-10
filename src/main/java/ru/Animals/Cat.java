package ru.Animals;

public class Cat extends Animal {
    public void Make_noise () {
        System.out.println("may");
    }
    @Override boolean Move (){return true;};
    @Override boolean Eat (){return true;};
    @Override boolean Climb_trees (){return true;};
    @Override boolean Swim (){return false;};
    public Cat(String name, int age, String color) {
        super(name, age, color);}

}
