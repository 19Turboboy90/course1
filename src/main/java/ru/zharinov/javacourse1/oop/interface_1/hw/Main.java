package ru.zharinov.javacourse1.oop.interface_1.hw;

import java.util.ArrayList;

/*
Создать класс Работник, у которого есть одно поле name. Конструктор, в котором мы инициализируем это поле. Геттер на поле
name и метод voice, в котором на экран выводится имя сотрудника. После этого создать 3 класса, которые наследуются от
Работника - программист, водитель, повар. Конструктор этих классов также должны принимать всего один параметр - имя.

Создать три интерфейса - Способный программировать, способны готовить и способный водить машину. В каждом из них по
одному методу, которые не возвращают никаких данных и не принимают параметров, названия методов соответственно:
писать код, готовить и водить.

После этого каждый работник должен реализовать соответствующий ему интерфейс.

В классе main нужно создать по три работника каждой специальность, в цикле произвести перекличку,
т.е у всех работников вызвать метод voice, а затем заставить всех работать, вам понадобится еще 3 цикла.
 */
public class Main {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Ivan");
        Programmer programmer2 = new Programmer("vadim");
        Programmer programmer3 = new Programmer("Svetlana");

        ArrayList<CodeWritable> programmers = new ArrayList<>();
        programmers.add(programmer1);
        programmers.add(programmer2);
        programmers.add(programmer3);

        Cook cook1 = new Cook("Jon");
        Cook cook2 = new Cook("Zaur");
        Cook cook3 = new Cook("Vladimir");

        ArrayList<Cookable> cookers = new ArrayList<>();
        cookers.add(cook1);
        cookers.add(cook2);
        cookers.add(cook3);

        Driver driver1 = new Driver("Pavel");
        Driver driver2 = new Driver("Natasha");
        Driver driver3 = new Driver("Dima");

        ArrayList<Drivable> drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(programmer1);
        employees.add(programmer2);
        employees.add(programmer3);
        employees.add(cook1);
        employees.add(cook2);
        employees.add(cook3);
        employees.add(driver1);
        employees.add(driver2);
        employees.add(driver3);

        for (Employee employee : employees) {
            employee.voice();
        }
        for (CodeWritable programmer : programmers) {
            programmer.writeCode();
        }

        for (Drivable drivable : drivers) {
            drivable.drive();
        }

        for (Cookable cookable : cookers) {
            cookable.cook();
        }

    }
}
