package ru.Animals;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat cat = new Cat("barsik",3,"white") ;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("Cat", cat.getName()); }

    @org.junit.jupiter.api.Test
    void getAge() {
        assertEquals(3, cat.getAge());}

    @org.junit.jupiter.api.Test
    void getColor() {
        assertEquals("red", cat.getColor());    }

}