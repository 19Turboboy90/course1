package ru.zharinov.javacourse1.java_level_2.generics.hw2;

/*
1. Создать класс Fruit и его наследников Apple и Orange.

2. У каждого фрукта можно получить его вес (для яблока - 1, для апельсина - 1.5).

3. Создать параметризированный класс Basket (корзина фруктов). Если класс параметризован типом Apple, то в нем можно
хранить только яблоки, если Orange - только апельсины, если Fruit, то любые фрукты. Для хранения фруктов внутри корзины
можно использовать ArrayList.

4. В классе Basket добавить метод getWeight, который возвращает общую массу всех фруктов.

5. Добавить метод add, который добавляет фрукт в корзину.

6. Добавить метод compare, который сравнивает 2 корзины по весу. Сравнивать можно корзины с любыми фруктами. Если корзина,
у которой вызвали метод, по весу больше той, что передали в качестве параметра, то метод возвращает 1, если меньше, то -1,
если равны - 0.

7. Добавить метод transfer, который пересыпает фрукты из текущей корзины в ту, что передали в качестве параметра.
Сортировка должна сохраниться, то есть в корзину с яблоками нельзя пересыпать апельсины, а в корзину с объектами
родительского типа Fruit можно пересыпать любые фрукты.
 */
public class Main {
    public static void main(String[] args) {
        Basket<Apple> appleBasket = new Basket<>();
        appleBasket.add(new Apple());
        appleBasket.add(new Apple());
        appleBasket.add(new Apple());
        appleBasket.add(new Apple());
        System.out.println("Apples " + appleBasket.getWeight());



        Basket<Fruit> fruitBasket = new Basket<>();
        fruitBasket.add(new Apple());
        fruitBasket.add(new Orange());
        fruitBasket.add(new Apple());
        fruitBasket.add(new Orange());
        System.out.println("Fruits " + fruitBasket.getWeight());


        Basket<Orange> orangeBasket = new Basket<>();
        orangeBasket.add(new Orange());
        orangeBasket.add(new Orange());
        orangeBasket.add(new Orange());
        orangeBasket.add(new Orange());
        System.out.println("Orange " + orangeBasket.getWeight());

    }
}
