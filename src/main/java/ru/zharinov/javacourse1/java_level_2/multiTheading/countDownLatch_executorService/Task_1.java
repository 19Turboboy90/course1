package ru.zharinov.javacourse1.java_level_2.multiTheading.countDownLatch_executorService;

import java.util.concurrent.*;

/*
Задача:

Поток 1 должен имитировать загрузку имени пользователя, поток 2 - загрузку возраста пользователя.

Пока идет загрузка, в консоли должны выводиться точки, отображающие процесс загрузки. После окончания загрузки у нас
должна быть выведены строки:

"Имя____, возраст ____"
После этого вывод точек должен прекращен.
 */
public class Task_1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                t.setDaemon(true);
                return t;
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.print(".");
                        Thread.sleep(300);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Future<String> futureName = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(5000);
                return "John";
            }
        });
        Future<Integer> futureAge = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(5000);
                return 17;
            }
        });
        try {
            String name = futureName.get();
            Integer age = futureAge.get();
            System.out.println("\nName: " + name + " Age " + age);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
    }
}
