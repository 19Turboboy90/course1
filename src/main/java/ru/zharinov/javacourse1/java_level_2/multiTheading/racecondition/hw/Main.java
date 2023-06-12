package ru.zharinov.javacourse1.java_level_2.multiTheading.racecondition.hw;

/*
Создать класс Банкомат, в котором изначально есть какая-то сумма денег. Создать метод, который выводит деньги со счета.
В качестве параметра этот метод принимает имя человека, который выводит деньги и сумму, которую он хочет вывести.

Последовательность действий внутри метода:
1. Выводится строка "Имя подошел к банкомату"
2. Поток останавливается на 2 секунды.
3. Осуществляется проверка если в банкомате достаточно денег для выдачи, то выводится строка
"Имя вывел сумму рублей. В банкомате осталось оставшиеся сумма рублей".
Если же в банкомате недостаточно денег, то выводится строка - "В банкомате недостаточно денег для имя".

В методе main создайте несколько потоков, каждый из которых будет представлять собой клиента, который хочет вывести деньги.
Например: сделайте так, что кому-то из них не хватает денег и запустите код на выполнение.

Из-за отсутствия синхронизации у вас может возникнуть проблема - состояние гонки. После того, как деньги закончились,
кто-то еще смог вывести и в банкомате осталась отрицательная сумма. Когда убедитесь, что проблема есть, решите ее двумя
способами:

1. Без синхронизации. При помощи метода join - пусть каждый поток ждет, пока закончит предыдущий и потом приступает к
работе.

2. С помощью синхронизации. Синхронизируйте метод, используя в качестве монитора this, а потом сделайте тоже самое
используя свой созданный объект синхронизации.

В каждом случае проверяйте код на работоспособность.
 */
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.withdrawCash("Nikolay", 6000);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.withdrawCash("Ivan", 6000);
            }
        });
        thread1.start();
        thread2.start();
    }
}

