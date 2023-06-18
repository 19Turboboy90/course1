package ru.zharinov.javacourse1.java_level_2.multiTheading.deadlock.hw;

/*
Создать класс МФУ (многофункциональное устройство), которое умеет сканировать и печатать документы. У него должно быть 2
метода print и scan, которые в качестве параметра принимают количество страниц.

Если вы передали в метод print число 3, выводит "Опечатано 1стр", потом "Опечатано 2 стр", "Опечатано 3стр". Между
выводами добавьте небольшую задержку. Метод scan делает то же самое, только вместо слова "Опечатано" будет "Отсканировано".

Методы должны быть синхронизированы таким образом, чтобы можно было из разных потоков одновременно запустить сканирование
и печать, но при этом нельзя одновременно сканировать или печатать несколько документов.
 */
public class Main {
    public static void main(String[] args) {
        MFP mfa = new MFP();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                mfa.print(3);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                mfa.scan(3);
            }
        });
        thread1.start();
        thread2.start();
    }
}
