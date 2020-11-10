package ru.Animals;

public class Dog extends Animal  {
    public void Make_noise (){System.out.println("gav");}
    @Override boolean Move (){return true; };
    @Override boolean Eat (){return true; };
    @Override boolean Climb_trees (){return false; };
    @Override boolean Swim (){return true;};
    public Dog (String name, int age, String color) {
        super(name, age, color); }
}
