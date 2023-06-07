### Алгоритмическая сложность операции:

О(1) - операция выполняется за точное (константное) время, и не зависит от размера коллекции - лучшая алгоритмическая
сложность, которая только возможна (операция происходит быстро).

О(N) - скорость выполнения операции напрямую зависит от размера коллекции. Чем больше элементов она содержит, тем дольше
будет выполняться операция.

с

### Алгоритмическая сложность операций в коллекции ArrayList

    O(1) - Получение элемента по индексу                    (преимущество ArrayList)
    O(1) - Вставка элемента в конец списка                  (преимущество ArrayList)
    О(N) - Удаление элемента                                (недостаток ArrayList)
    О(N) - Вставка элемента в середину или начало списка    (недостаток ArrayList)

### Алгоритмическая сложность операций в коллекции LinkedList

    O(N) - Получение элемента по индексу                    (преимущество ArrayList)
    O(1) - Вставка элемента в конец списка                  (преимущество ArrayList)
    О(1) - Удаление элемента                                (недостаток ArrayList)
    О(1) - Вставка элемента в середину или начало списка    (недостаток ArrayList)

### Выводы:

Если нужно часто удалять элементы из коллекции или часто вставлять объекты в начало или середину списка - используйте
LinkedList

При удалении элементов из коллекции в LinkedList память освобождается сразу, а в ArrayList - нет.

Если нужно часто вставлять элементы в конец списка или получить объекты по индексу, то используйте ArrayList. По
документации - "всегда вместо обычных массивов используйте ArrayList".

### Вопросы:

1. В чем отличие коллекций ArrayList и LinkedList?

В основе ArrayList лежит массив, а в основе LinkedList связный список.

2. Алгоритмическая сложность получения элемента по индексу в ArrayList и LinkedList?

ArrayList - О(1)
LinkedList - О(N)

3. Алгоритмическая сложность удаления элемента по индексу в ArrayList и LinkedList?

ArrayList - О(N)
LinkedList - О(1)

4. В каких случаях стоит использовать LinkedList вместо ArrayList?

Если часто приходится вставлять элементы в середину коллекции или удалять их, стоит использовать LinkedList.
ArrayList обычно используют вместо обычного массива.

5. В ArrayList постоянно добавляется и удаляется из него множество элементов, какие возникнуть проблемы?

В таком случае может быть утечка памяти. Из-за того, что внутренний размер массива не уменьшается автоматически.

***

1. Правила для методов equals и hashcode:

    1. Переопределил equals - переопредели и hashcode.
    2. Если хэш-коды объектов разные, то и объекты точно разные
    3. Если хэш-коды объектов равны, то это *НЕ* значит, что объекты одинаковые. Хеш-код может просто совпасть(коллизии)

2. Как сравнивать два объекта по значениям их полей?

Использовать метод equals (он должен быть переопределен)

3. Почему ссылочные типы нельзя сравнивать через знак "=="?

Потому что таким образом сравниваются не сами объекты, а только ссылки - ссылаются они на один и тот же объект или нет

***

Set - коллекции этого типа не могут хранить повторяющихся элементов

Алгоритмическая сложность вставки и удаление объектов в HashSet - O(1)

### Вопросы:

1. Почему в реализации методов в коллекции HashSet нет запросов по индексу?

Структура HashSet не позволяет обращаться к элементам по индексу, так элементы в коллекцию добавляются не
последовательно, а в зависимости от hashcode элемент может быть добавлен, как в начало, середину так и в конец коллекции

2. Можно ли быть уверенным, что элементы в коллекции будут храниться в том порядке, в котором они были туда добавлены?

Нет, порядок элементов зависит от их hashcode, и постоянно меняется при увеличении размера хэш-таблицы(массива)

3. В классе, экземпляры которого хранятся в коллекции HashSet, переопределен equals, но не переопределен hashcode,
   будет ли корректно работать коллекция HashSet? Будут ли проходить успешно тесты?

Тесты не пройдут, коллекция будет работать некорректно. Т.к. у двух объектов с одинаковыми полями хэш-код будет
отличаться,
соответственно будут отличаться и их позиции в хэш-таблице.

4. Метод hashcode плохо переопределен (к примеру всегда возвращает число 1), как в этом случае будет вести себя
   коллекция HashSet?

Будут постоянно происходить коллизии, все элементы будут лежать в одной ячейке хэш-таблицы и сложность добавления и
удаления элементов станет О(N) вместо О(1).

5. Зачем был создан отдельный интерфейс Set? Почему нельзя было сделать так, чтобы HashSet реализовывал интерфейс List?

Из-за структуры HashSet мы не можем реализовать все методы, которые есть в интерфейсе List.

***

### Вопросы:

1. Расскажите об иерархии классов в Collections Framework

Наверху иерархии находится интерфейс Iterable, который позволяет перебирать элементы коллекции в цикле foreach. Затем,
ниже по иерархии находится интерфейс Collection. От Collection наследуются интерфейсы List, Set и Queue. Основные
реализации List - это ArrayList и LinkedList, а Set - HashSet, TreeSet и LinkedHashSet. LinkedList реализует интерфейс
Queue. Отдельно стоит интерфейс Map, у которого основные реализации HashMap, TreeMap и LinkedHashMap.

2. Чем отличаются интерфейсы Set и List?

Коллекции Set в отличии от List

- Не могут хранить повторяющихся элементов.
- Не содержат методов, в которых можно обращаться к элементу по его индексу: get(int index), add(T element, int index),
  removeAt(int index)

3. Алгоритмическая сложность операций

                                                         ArrayList      LinkedList        HashSet

           add(T element);                                O(1)            O(1)             O(1)
           add(T element, index);                         O(N)            O(1)              -
           removeAt(int index);                           O(N)            O(1)              -
           contains();                                    O(N)            O(N)             O(1)

4. В каких случаях вы будете использовать коллекции ArrayList, LinkedList и HashSet?

LinkedList - если часто нужно вставлять элементы в начало или середину списка либо необходимо часто удалять объекты из
коллекции.

HashSet - если необходимо, чтобы в коллекции не было повторяющихся элементов.

ArrayList - используется вместо обычных массивов, стоит использовать, если часто приходится вставлять элементы в конец
списка или получать объекты по индексу.

5. Как устроена память в Java?

Примитивные типы и ссылки на объекты хранятся в стэке, а в сами объекты в куче (heap)

6. Если 2 объекта ссылаются только друг на друга, уничтожит ли их сборщик мусора?

Да, если на эти объекты нет ссылки из стэка, то их уничтожит сборщик мусора

7. Зачем нужен метод hashcode?

Hashcode возвращает числовое представление объекта. Используется в коллекциях HashSet для определения позиции элемента
хэш-таблице

8. В HashSet используются объекты класса, у которого переопределен метод equals, но не переопределен hashcode. Что будет
   происходить?

У двух одинаковых по equals объектов будут отличаться хэш-коды, поэтому могут отличаться и их позиции в хэш-таблице.
Из-за этого коллекция будет работать неправильно, в ней смогут находиться повторяющиеся элементы и могут возникать
проблемы при удалении и поиске объекта (из-за отличий в их хэш-коде объект, который есть в коллекции, может быть не
найден)

***
Сходства и различия HashSet и TreeSet

Сходства:

- реализуют интерфейс Set
- не хранят повторяющихся элементов

Отличия:

- TreeSet хранит объекты в отсортированном виде
- HashSet может хранить объекты любых классов, а TreeSet только тех, которые реализуют интерфейс Comparable, либо любых
  классов при условии, что в качестве параметра в конструктор был передан Comparator.
- Алгоритмическая сложность операций вставки, удаления и поиска элемента: HashSet - О(1), TreeSet - O(log(N))

### Вопросы:

1. Что представляет собой интерфейс Map?

Коллекции типа Map хранят объекты парами ключ-значении

2. Основные методы в интерфейсе Map?

void put(K key, V value);

V remove(K key);

Set<K> keySet();

List<V> values();

void clear();

int size();

3. Находится ли интерфейс Map в иерархии коллекций?

Нет, интерфейс Map является коллекцией, но не находится в иерархии Collections Framework. Он не наследуется ни от
интерфейса
Collection ни от интерфейса Iterable.

4. Почему интерфейс Map не находится в иерархии Collections Framework?

Коллекция Map в отличие от других коллекций работает не с одиночными объектами, а с парами. Из-за этого коллекции
данного типа не могут реализовывать методов из интерфейса Collection.

5. Как устроен HashMap изнутри?

В основе HashMap лежит хэш-таблица (массив из 16 элементов типа Entry). При добавлении нового объекта на основе его
хэш-кода
вычисляется номер позиции в хэш-таблице, куда и помещается элемент. Если там уже лежит какой-то объект, тогда с помощью
метода equals проверяется не равен ли его ключ тому, что мы вставляем. Если равен, то мы перезаписываем его значение,
если нет, то значит произошла коллизия.

6. Что такое коллизия, и как она разрешается в коллекции HashMap?

Если у объектов с разными ключами получилась одна и та же ячейка в хэш-таблице, то про такую ситуацию говорят
"произошла коллизия". Она разрешается созданием связного списка в той ячейке (или еще говорят "в той корзине"), в
которой произошла коллизия.

7. Алгоритмическая сложность операций в HashMap?

- Лучший случай (все элементы распределены равномерно в хэш-таблице)
- Худший случай (все элементы лежат в одной ячейке хэш-таблице в виде связного списка)

`Сложность всех операций HashMap.
В лучшем случае - О(1), в худшем - О(log(N))`

8. Как получить все ключи из коллекции HashMap?

Использовать метод keySet();

9. Как получить все значения из коллекции HashMap?

Использовать метод values();

10. Гарантируется ли порядок элементов в коллекции HashMap?

Нет. Все элементы распределяются на основе хэш-кодов их порядок будет постоянно изменяться.

11. Что произойдет, если мы добавим в HashMap пару объектов ключ-значение, при этом такой ключ уже присутствовал в
    коллекции, а значение лежало другое?

Значение по данному ключу будет перезаписано.

12. При какой ситуации в коллекции HashMap может потеряться элемент?

Если в качестве ключа используется измененный объект и после того, как он был добавлен в коллекцию, у него изменили
какое-то поле, от которого зависит хэш-код.

***

1. Если порядок элементов в коллекции не важен, то используйте коллекции с приставкой Hash(HashMap, HashSet).
2. Если объекты должны быть отсортированы, то используйте коллекции с приставкой Tree (TreeMap, TreeSet).
3. Если объекты должны храниться в порядке их добавления, то используйте коллекции с приставкой Linked (LinkedHashMap,
   LinkedHashSet).
4. Если в качестве ключа используется изменяемый объект, и у него было изменено поле, от которого зависит хэш-код, то
   элементы может потеряться из коллекции.

***

Ограничение на использование Generics

1. В качестве параметра обобщенного типа можно использовать только ссылочные типы
2. Нельзя создать объект обобщенного типа.
3. Нельзя создать массив объектов обобщенного типа.

### Вопросы:

1. Что такое Generics?

Generics - параметризованные типы. С их помощью можно объявлять классы, интерфейсы и методы, где тип данных указан в
виде
параметра.

2. Как и для чего используются ключевые слова extends и super в обобщенных типах?

Эти ключевые слова нужны, чтобы наложить ограничение на тип, переданный классу или методу.
Ключевое слово extends означает, что может быть использован SomeClass или любой наследник этого класса.
Ключевое слово super означает, что может быть использован класс SomeClass, либо его родитель.

3. Что такое wildcard?

Wildcard (или маска) - это дженерик вида <?>, что означает, что тип может быть чем угодно. На них можно также
накладывать
ограничения с помощью ключевых слов extends и super.

4. Если метод принимает в качестве параметра коллекцию объектов типа Number, можно ли передать в него коллекцию объектов
   типа Integer?

Нет.

5. Что должен принимать метод в качестве параметра, чтобы он мог принимать коллекцию чисел любого типа - float, double и
   т.д?

List<? extends Number>

***

Многопоточность - средство, которое позволяет выполнять задачи одновременно.

- Многопоточность на основе процессов - дает возможность разным программам или процессам работать параллельно.
- Многопоточность на основе потоков - дает возможность выполнять одновременно несколько задач в рамках одной программы.

1. Какие способы создания потоков вы знаете?

- Унаследоваться от класса Thread.
- Реализовать интерфейс Runnable.

