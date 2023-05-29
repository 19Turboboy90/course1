### Алгоритмическая сложность операции:

О(1) - операция выполняется за точное (константное) время, и не зависит от размера коллекции - лучшая алгоритмическая
сложность, которая только возможна (операция происходит быстро).

О(N) - скорость выполнения операции напрямую зависит от размера коллекции. Чем больше элементов она содержит, тем дольше
будет выполняться операция.

***

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
