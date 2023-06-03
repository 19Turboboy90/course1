package ru.zharinov.javacourse1.java_level_2.collections.queu;

import org.junit.Before;
import org.junit.Test;
import ru.zharinov.javacourse1.java_level_2.collections.Car;
import ru.zharinov.javacourse1.java_level_2.collections.list.CarLinkedList;

import static org.junit.Assert.assertEquals;

public class CarQueueTest {

    private CarQueue carQueue;

    @Before
    public void setUp() throws Exception {
        carQueue = new CarLinkedList();
        for (int i = 0; i < 10; i++) {
            carQueue.add(new Car("Brand" + i, i));
        }
    }

    @Test
    public void add() {
        assertEquals(10, carQueue.size());
    }

    @Test
    public void peek() {
        Car car = carQueue.peek();
        assertEquals("Brand0", car.getBrand());
        assertEquals(10, carQueue.size());
    }

    @Test
    public void poll() {
        Car car = carQueue.poll();
        assertEquals("Brand0", car.getBrand());
        assertEquals(9, carQueue.size());
    }
}