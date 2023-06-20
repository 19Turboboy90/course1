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
5. Обычные коллекции не потокобезопасны
6. Чтобы создать потокобезопасную коллекцию из обычной, можно воспользоваться статическими методами из класса
   Collections - synchronizedList, synchronizedSet, synchronizedMap
7. Если нужна более оптимизированная коллекция, то стоит использовать коллекции из пакета concurrent:
   CopyOnWriteArrayList
   CopyOnWriteArraySet
   CopyOnWriteHashMap

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

***

### Многопоточность

Потоки-демоны — это низкоприоритетные потоки, работающие в фоновом режиме для выполнения таких задач, как сбор «мусора»:
они освобождают память неиспользованных объектов и очищают кэш. Большинство потоков JVM (Java Virtual Machine) являются
потоками-демонами.

Состояние гонки (англ. race condition), также конкуренция — ошибка проектирования многопоточной системы или приложения,
при которой работа системы или приложения зависит от того, в каком порядке выполняются части кода. Своё название ошибка
получила от похожей ошибки проектирования электронных схем (см. Гонки сигналов).

Если методы синхронизированы по одному монитору, то одновременно может работать только один из них.

### Вопросы:

1. Что такое многопоточность?

Многопоточность - способность выполнять несколько задач одновременно в разных потоках.

2. Чем отличается синхронизированный метод от несинхронизированного?

Синхронизированный метод может быть вызван одновременно только одним потоком.

3. Что такое объект синхронизации (монитор)? Для чего он нужен?

Это объект или класс, по которому происходит синхронизация потоков. Если поток видит, что монитор занят, то будет ждать
его освобождения, если монитор свободен, то поток его занимает и монитор переходит в состояние "Занят".

4. Что может участвовать в роли объекта синхронизации?

Любой класс или объект.

5. Что является монитором, если весь метод помечен ключевым словом synchronized?

Объект, у которого вызывается данный метод(this),

6. Какие из этих методов могут работать одновременно из разных потоков, а какие нет и почему?

private final Object lock1 = new Object();
public void method1(){}
public synchronized void method2(){}
public synchronized void method3(){}
public void method4(){
synchronized(lock1){}
}

Одновременно могут работать методы 1,2,4 или 1,3,4, т.к метод1 не синхронизирован, а метод4 использует свой объект
синхронизации. Значит одновременно не могут работать только методы 2 и 3, потому что они используют один и тот же
монитор(this).

7. Можем ли мы остановить поток после запуска? Если да, то каким способом?

Можем, двумя способами - первый способ не рекомендуется через метод stop, второй способ - через метод interrupt.

8. Почему остановка через метод stop не рекомендуется?

Потому что поток может делать какую-то задачу по работе с данными, к примеру писать значения в базу. Если вызвать stop,
то поток будет мгновенно остановлен и данные могут быть повреждены.

9. Что произойдет при вывозе метода interrupt? Почему такой способ безопаснее?

Этот способ безопаснее, т.к. interrupt не останавливает поток, а только устанавливает флаг isInterrupted в true. Внутри
самого потока мы должны обработать такую ситуацию и прописать, что делает, если isInterrupted установлен в true.

10. Что делает метод join?

Приостанавливает поток, в котором вызвали этот метод, и ждет завершения работы потока, у которого вызвали метод join.

11. Как получить ссылку на главный поток?

В главном потоке вызвать статический метод класса Thread - currentThread();

12. Почему методы sleep и join нужно оборачивать в try catch? Какое исключение может быть брошено и в какой момент?

Если у потока, который находится в спящем состоянии, вызвать метод interrupt, то будет брошено исключение
InterruptedException. Чтобы обработать эту ситуацию, методы sleep и join нужно оборачивать в try catch.

13. Какие способы синхронизации потоков вы знаете?

Добавить ключевое слово synchronized к сигнатуре метода или создать блок синхронизации - указать ключевое слово
synchronized, затем в круглых скобках объект синхронизации и в фигурных скобках участок кода, который должен быть
синхронизирован.

14. В классе часть методов помечена ключевым словом synchronized, и часть не помечена. Если какой-то поток вызвал
    синхронизированный метод, то можем ли мы в тот же момент вызвать другой синхронизированный/несинхронизированный
    метод?

Несинхронизированные методы можно вызывать одновременно из неограниченного числа потоков. Если методы синхронизированы
по одному монитору, то вызвать их одновременно из разных потоков нельзя.
Ответ на вопрос: синхронизированный нет, несинхронизированный -можно.

15. Что такое потоки - демоны?

Поток демон - такой поток, который уничтожается автоматически после завершения работы всех основных потоков.

16. Какие вы знаете способы создания нового потока?

Унаследоваться от класса Thread, реализовать интерфейс Runnable.

17. Какой из этих способов предпочтительнее?

Реализовать интерфейс Runnable, потому что в Java запрещено множественное наследование, а интерфейсов мы можем
реализовывать столько сколько захотим.

18. Чем отличается методы run от start?

В методе run мы описываем действия, которые будет выполнять поток после запуска. Метод start создает новый поток и
внутри нового потока вызывает метод run. Запускать поток нужно всегда через метод start, вызывать run вручную не нужно.

19. Расскажите про методы wait, notify, notifyAll? Зачем они нужны, и у каких объектов мы можем их вызвать?

Эти методы нужны для синхронизации потоков. Они определены в родительском для всех классе Object, соответственно мы
можем их вызывать у любых объектов, которые используются в качестве монитора.

20. Что делает метод wait?

Переводит поток в режим ожидания и освобождает монитор.

21. Что делают методы notify и notifyAll?

Пробуждают потоки, которые находятся в режиме ожидания. Метод notify пробуждает только один поток, а метод notifyAll -
все потоки(синхронизированные по тому объекту, у которого вызван метод)

22. Что такое Deadlock?

Deadlock - взаимная блокировка, - явление, при котором все потоки находятся в режиме ожидания.

23. Что вы знаете о синхронизированных коллекциях?

Если с одной коллекцией работать из разных потоков, то во избежание ошибок из-за состояния гонки, чтобы она была
синхронизирована.

Для создания синхронизированной коллекции можно воспользоваться статическим методом из класса Collections -
synchronizedList, synchronizedSet, synchronizedMap, который в качестве параметра принимает обычную коллекцию и
возвращает ее синхронизированный вариант.

Или можно воспользоваться готовыми коллекциями из пакета concurrent - ConcurrentHashMap, CopyOnWriteArrayList,
CopyOnWriteArraySet и т.д.

24. Зачем нужен ExecutorService?

Он позволяет выполнять задачи, используя пул потоков, а также возвращать результат выполнения задачи в виде объекта
Future.

25. В чем отличие методов submit и execute у ExecutorService?

Execute не возвращает значений и принимает в качестве параметра объект типа Runnable. Submit возвращает объект типа
Future, из которого можно получить значение, используя метод get, и принимает в качестве параметра Runnable или Callable

26. В чем отличие интерфейсов Runnable и Callable?

Реализуя интерфейс Runnable, нужно переопределить один метод run, у которого возвращаемый тип void, а в интерфейсе
Callable нужно переопределить метод call, который возвращает значение нужного типа.

27. Какие виды пулов потоков вы знаете?

SingleThreadPool - пул из одного потока, все задачи переданные в него будут выполняться последовательно,ожидая своей
очереди на исполнение.

FixedThreadPool - пул потоков фиксированной длины, при его создании вы сами указываете, сколько потоков будет создано.

CachedThreadPool - потоки будут создаваться по мере необходимости, если прилетит новая задача, пока все потоки заняты,
то будет создан еще один поток.

28. Как мы можем влиять на потоки, которые создаются в ExecutorService? К примеру, как сделать их демонами?

При создании экземпляра ExecutorService нужно передать объект интерфейсного типа ThreadFactory. У него нужно
переопределить метод new Thread, который принимает в качестве параметра Runnable и возвращает объект типа Thread.
Внутри мы сами создаем новый поток, устанавливаем у него setDaemon(true) и возвращаем созданный поток.

29. Для чего нужны атомарные типы данных?

Если мы работаем с одной переменной из разных потоков, то может возникнуть состояние гонки из-за того, что некоторые
действия делаются не за одну операцию, а за несколько, к примеру операция инкремента, для которой нужно сделать 3
действия - получить старое значение, увеличить его на 1, поместить новое значение в переменную. Атомарные типы
предоставляют возможность делать такие действия за одну операцию, при помощи методов getAndSet, getAndIncrement и
т.д. Тем самым, мы избегаем состояние гонки.

30. Ключевое слово volatile - зачем оно нужно и где его стоит применять?

Volatile - запрещает кэшировать переменную (сохранять значение в локальной память потока)

31. Расскажите про классы Semaphore, CountDownLatch и CyclicBarrier

Класс Semaphore ограничивает доступ к ресурсу из разных потоков. Можно установить максимальное количество потоков,
которые одновременно работают с одним участком кода. Остальные потоки будут ждать, пока длы них освободится место.

CountDownLatch предоставляет возможность любому количеству потоков в блоке кода ожидать до тех пор, пока не завершатся
определенное количество операций, выполняющихся в других потоках. В конструкторе CountDownLatch передается количество
операций, которое должно быть выполнено, чтобы замок "отпустил" заблокированные потоки.

CyclicBarrier очень похож на CountDownLatch. В нем указанное количество потоков встречается в определенном месте
программы и блокируется. Как только все потоки прибыли, барьер опускается, и ожидающие потоки освобождаются. Главное
различие между CyclicBarrier и CountDownLatch -после того как счетчик достигнет нуля, вы не сможете заново использовать
CountDownLatch, а CyclicBarrier можно использовать снова, так как его счетчик после достижения нуля возвращается в
исходное состояние.

https://habr.com/ru/post/277669/

32. В одном классе есть синхронизированные статические методы и синхронизированные нестатические. Могут ли одновременно
    в разных потоках работать статический и нестатический синхронизированные методы?

Вы уже должны знать, что статические члены класса (поля и методы) относятся к классу, а не к объекту. Статические методы
можно вызывать, не создавая объект класса. То есть если статический метод помечен ключевым словом synchronized, то в
роли монитора у него никак не может использоваться this (тот объект, у которого вызвали метод), потому что этот метод
вызывается не у объекта, а у класса. Когда мы изучали мониторы, то говорили о том, что в роли монитора может выступать
любой класс или объект.

Поэтому информация, которую нужно понять и запомнить -

Если нестатический метод помечен ключевым словом synchronized, то в роли монитора используется this (тот объект, у
которого вызван метод)

Если статический метод помечен ключевым словом synchronized, то в роли монитора выступает сам класс.

Отсюда можно сделать вывод, что у статических и нестатических синхронизированных методов будут разные мониторы, а значит
их можно вызывать одновременно в разных потоках, т.к. они друг на друга никак не влияют.

33. Чем отличаются методы shutdown и shutdownNow у ExecutorService?

Мы в курсе изучали такой момент - если в ExecutorService больше не нужно передавать задачи, то нужно вызвать метод
shutdown, тогда он не будет находиться в состоянии ожидания новых задач. Но при этом он никак не влияет на уже
запущенные задачи.

Если нам нужно остановить уже запущенные задачи, тогда можно вызвать метод shutdownNow. Он делает тоже самое, что метод
shutdown, но при этом у всех запущенных потоков он вызывает метод interrupt.

Отсюда можно сделать вывод, что если в потоках не было обработано состояние isInterrupted, то в этих методах никакой
разницы вы не увидите. Метод shutdownNow не останавливает потоки через метод stop, а лишь устанавливает флаг
isInterrupted в true.

### Stream API

Некоторые методы, такие как поиск элемента, получение максимального или минимального значения возвращает тип Optional

Тип Optional - контейнер для результата, он может содержать или не содержать значение.

Чтобы получить значение из Optional, нужно вызвать метод get, предварительно сделав проверку через isPresent, либо
используя функциональный стиль - через метод ifPresent или ifPresentOrElse.

Способы создания стримов -

1. Метод stream или parallelStream у коллекций.
2. Статический метод stream у класса Arrays для преобразования массива в поток данных.
3. Статические методы класса Stream - of, generate и другие.

Метод parallelStream создает параллельный поток данных, один поток разбивается на несколько участков, операции над
каждым участком выполняются одновременно, после чего поток снова склеивается. Это позволяет некоторые операции делать
быстрее.

### Вопросы:

1. Что такое функциональный интерфейс?

Интерфейс с одним абстрактным методом

2. Что делает метод stream?

Превращает коллекцию в поток данных

3. Зачем нужно преобразовывать коллекции в потоки данных?

В потоке данных можно выполнять множество операций, таких как сортировка, фильтрация, преобразование, очень компактно,
не создавая при этом множество копий коллекций.
А также, работая со стримами, можно легко распараллелить задачи, просто вызвав метод parallelStream.

4. Какие способы создания стримов знаете?

Метод stream у коллекций, статический метод stream у класса Arrays ля преобразования массива в потоки данных и
статические методы у класса Stream - of, ofNulls, generate и другие

5. Чем отличается терминальный оператор от промежуточного?

Терминальный оператор является завершающим - он обрабатывает элементы и завершает работу стрима, поэтому терминальный
оператор в цепочке может быть только один. Он же запускает работу всех промежуточных операторов.

Промежуточный - обрабатывают поступающие элементы и возвращают stream. Промежуточных операторов в цепочке обработки
элементов может быть много.

6. Приведите примеры терминальных и промежуточных операторов

Терминальные - collect, count, max, min, forEach.
Все методы, которые возвращают не поток данных.

Промежуточные - все, которые возвращают поток данных - filter, map, limit и другие.

7. Что делает метод map?

Применяет операцию преобразования к каждому элементу потока, на выходе элементы могут иметь любой тип

8. Тип Optional - что это и какое он имеет отношение к стримам?

Объект типа Optional является контейнером, в которых может храниться объект или не храниться ничего. Сам объект из
контейнера мы можем получить через метод get, перед этим выполнив проверку через метод isPresent, либо используя
функциональный стиль - через метод ifPresent или ifPresentOrElse

Терминальные операторы, которые возвращают элемент из потока, к примеру findFirst, min, max возвращают объект типа
Optional, так как нет гарантии, что в потоке вообще есть данные.

9. Как работает метод filter?

Фильтр принимает в качестве параметра Predicate - функцию, которая возвращает тип Boolean - оставляем элемент в потоке
или нет. Каждый элемент потока передается в эту функцию, если она возвращает true, то элементы остается, если false -
удаляется

10. Оператор sorted сортирует данные в потоке. Как будет происходить сортировка, если мы вызовем этот метод у потока
    объектов какого-то нашего класса?

Метод sorted без параметров может сортировать объекты только того класса, который реализует интерфейс Comparable.
Поэтому, чтобы таким образом сортировать коллекцию объектов нашего класса, нужно в этом классе реализовать данный
интерфейс. Либо можно вызвать метод sorted, который принимает в качестве параметра Comparator и в реализации метод
compare показать, каким образом сортировать данные.


