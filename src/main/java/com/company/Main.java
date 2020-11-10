package com.company;
import ru.Animals.*;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Cat("barsik",3, "white");
        Animal animal2 = new Dog("sharik",1, "black");
        animal1.Make_noise();
        animal2.Make_noise();
    }
}