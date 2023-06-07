package ru.zharinov.javacourse1.java_level_2.generics.hw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoxTest {

    @Test
    public void testBox() {
        Box<String, Integer, Float> box1 = new Box<>("String", 2, 3.5f);
        Box<String, Integer, Float> box2 = new Box<>("String", 5, 6.5f);
        int expected = 17;
        int result = (int) (box1.getObject2() +  box1.getObject3() + box2.getObject2() + box2.getObject3());
        assertEquals(expected, result);
    }
}