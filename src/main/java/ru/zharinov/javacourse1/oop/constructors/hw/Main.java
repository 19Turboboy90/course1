package ru.zharinov.javacourse1.oop.constructors.hw;

/*
Создайте класс работник, в котором будет 3 поля: имя, должность и зарплата.
В конструкторе с параметрами проинициализировать все поля.

Добавить метод с параметром int, тип возвращаемого значения - String, который возвращает информацию о сотруднике.
А также о сумме заплаты, которую он получил за i месяцев (значение i передается в качестве параметра)

Продемонстрировать работу методов в классе Main
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivan", "Middle", 150000);
        System.out.println(employee.getInfo(12));
    }
}
