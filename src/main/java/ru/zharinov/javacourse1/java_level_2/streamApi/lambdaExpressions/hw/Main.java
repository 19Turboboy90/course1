package ru.zharinov.javacourse1.java_level_2.streamApi.lambdaExpressions.hw;

/*
Создать интерфейс Worker, с одним методом work(), который не принимает параметров и не возвращает значений.

А также создать класс Директор, у которого есть один метод, который заставляет работника работать. Он принимает в
качестве параметра объект интерфейсного типа Worker и вызывает у него метод work.

Затем в классе Main создайте директора и заставьте одного работника работать, используя анонимный класс, а затем при
помощи лямбда выражения
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        String result = director.force(5, n -> {
            for (int i = 0; i < n; i++) {
                System.out.println("Worker...");
            }
            return "Success";
        });
        System.out.println(result);
    }
}
