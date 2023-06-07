package ru.zharinov.javacourse1.java_level_2.generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BoxTest {
    @Test
    public void avg() {
        Box<Integer> box = new Box<>(5, 10, 1);
        Box<Float> box2 = new Box<>(5f, 10f, 1f);
        assertEquals(0, box.compare(box2));
    }

    @Test
    public void transfer() {
        List<Integer> src = new ArrayList<>();
        List<Integer> dst = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            src.add(i);
        }
        Box.transfer(src, dst);
        assertEquals(10, dst.size());
        assertEquals(0, src.size());
    }
}