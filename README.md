## Программирование на Java
<details>
  <summary>Лабораторная работа 1</summary>
  
  ### Вариант №7
  
  1. Напишите алгоритм бинарного поиска по массиву из 1_000_000 целых чисел двумя способами: с использованием рекурсии и без использования рекурсии. Сравните их по времени выполнения.
  2. Напишите алгоритм разбиения строки на слова, не используя метод split().

</details>

- [Бинарный поиск](https://github.com/zhizhkaa/upgraded-couscous/blob/main/src/LR1/BinarySearch.java)
- [Разделение строк](https://github.com/zhizhkaa/upgraded-couscous/blob/main/src/LR1/StringSplit.java)

<details>
  <summary>Лабораторная работа 2</summary>
  
  ### Вариант №7
  
  1. Напишите класс BestPlayer, имеющий нестатическое поле name. Напишите класс FootballClub, имеющий нестатические поля name, numberOfGames, bestPlayer (типа BestPlayer). Оба класса в виде POJO.
  2. В классе FootballClubDemo создайте массив, содержащий 3 объекта класса FootballClub. Распечатайте в консоль этот массив, отсортированный по названию, количеству сыгранных матчей, имени лучшего игрока, используя интерфейсы Comparable<FootballClub> и Comparator<FootballClub>.
  3. Выполните пп. 1 и 2, заменив обычный класс FootballClub на record класс FootballClubRecord. В классе FootballClubRecord напишите два конструктора: канонический и неканонический.


</details>

- [BestPlayer.java](https://github.com/zhizhkaa/upgraded-couscous/blob/main/src/LR2/BestPlayer.java)
- [FootballClub.java.java](https://github.com/zhizhkaa/upgraded-couscous/blob/main/src/LR2/FootballClub.java.java)
- [FootballClubDemo.java.java](https://github.com/zhizhkaa/upgraded-couscous/blob/main/src/LR2/FootballClubDemo.java.java)
- [FootballClubRecord.java.java](https://github.com/zhizhkaa/upgraded-couscous/blob/main/src/LR2/FootballClubRecord.java.java)

  <details>
    
<summary>Лабораторная работа 3</summary>
  
  ### Вариант №7
  #### Часть 1
  Дана папка с файлами и вложенными папками Directory_for_lab3, содержащая презентации, задания на лаб. работы и вопросы к лекциям по курсу Java.
Напишите код, перемещающий все презентации в папку «Lectures», вопросы – в папку «Questions», задания на лаб. работы – в папку «Assignments». В папке Directory_for_lab3 должно быть всего 3 папки, в каждой соответствующие файлы. По желанию, папки можно назвать по-другому.

  #### Часть 2

  1. Создайте новый Maven-проект.
  2. Создайте класс с методами, которые будут тестироваться:
    2.1 Статический метод, получающий строку, состоящую из 0, 1 и других цифр. Метод возвращает 0, если строка состоит только из 0 и 1; иначе возвращает количество других цифр.
    2.2 Нестатический метод, получающий два массива int[] и возвращающий наибольшее число среди элементов двух массивов.
  3. Напишите класс с тестами для этих двух методов, объект тестируемого класса должен быть создан до выполнения теста.
  4. Напишите параметризованный тестовый класс для первого метода (п.2.1), для тестирования используйте 5 наборов значений для аргументов теста.



</details>

- [FileMover.java (Часть 1)]([https://github.com/zhizhkaa/upgraded-couscous/blob/main/src/LR2/BestPlayer.java](https://github.com/zhizhkaa/upgraded-couscous/blob/main/src/LR3/FileMover.java))
- [Часть 2 (Архив будет скачиваться)](https://github.com/zhizhkaa/upgraded-couscous/raw/main/lr3.zip)

