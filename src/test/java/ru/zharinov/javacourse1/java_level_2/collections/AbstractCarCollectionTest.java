package ru.zharinov.javacourse1.java_level_2.collections;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ru.zharinov.javacourse1.java_level_2.collections.list.CarListTest;
import ru.zharinov.javacourse1.java_level_2.collections.map.CarMapTest;
import ru.zharinov.javacourse1.java_level_2.collections.queu.CarQueueTest;
import ru.zharinov.javacourse1.java_level_2.collections.set.CarSetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CarListTest.class,
        CarMapTest.class,
        CarQueueTest.class,
        CarCollectionTest.class,
        CarSetTest.class
})
public class AbstractCarCollectionTest {

}
