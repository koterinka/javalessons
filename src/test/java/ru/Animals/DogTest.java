package ru.Animals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

        Dog dog = new Dog("sharik",1,"black") ;

        @org.junit.jupiter.api.BeforeEach
        void setUp() {
        }

        @org.junit.jupiter.api.AfterEach
        void tearDown() {
        }

        @org.junit.jupiter.api.Test
        void getName() {
            assertEquals("sharik", dog.getName()); }

        @org.junit.jupiter.api.Test
        void getAge() {
            assertEquals(2, dog.getAge());}

        @org.junit.jupiter.api.Test
        void getColor() {
            assertEquals("red", dog.getColor()); }


}