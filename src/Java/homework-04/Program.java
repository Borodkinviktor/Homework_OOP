package homework.homework_004;
import java.util.Arrays;
/* Реализовать класс для работы с одномерными динамическими массивами произвольных данных(произвольного
типа). Класс будет иметь следующие конструкторы:
1. Конструктор без параметров – конструктор по умолчанию, проводяющий базовую иницаилизацию массива +
2. Конструктор с параметром T[] – конструктор, который проводит инициализацию и заполняет массив
 данными, пришедшими из параметра +
Так же класс будет иметь следующие публичные методы:
1. Вставка в массив +
2. Удаление элемента по индексу +
3. Удаление всех элементов с заданным значением +
4. Поиск минимума +
5. Поиск максимума +
6. Поиск суммы элементов массива +
7. Поиск произведения элементов массива +
8. Поиск индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1 +
9. Проверка наличия элемента в массиве. Возвращает true, если элемент в массиве есть, false – нет. +
10. Пузырьковая сортировка +
11. Сортировка простыми вставками +
12. Сортировка простым выбором +
13. Получение элемента массива по индексу +
14. Задание значения элементу массива с заданным индексом +
15. Печать массива на экран +
16. Длинна массива +
Так же класс должен содержать следующие приватные поля:
1. Сам массив произвольных данных. +
2. Длинну массива +
*Так же массив должен содержать следующие перегруженные операторы:
1. Оператор, получающий элемент по заданному индексу +
2. Оператор, позволяющий установить значение элемента по заданному индексу +
*Так же в случае, если могут произойти ошибки или некорретная работа в конструкторах или методах,
необходимо использовать механизм исключений для обработки возможных ошибок. +*/

public class Program {
    public static void main(String[] args) {
        Integer[] values = {5, 1, 7, 23, 87, 12, 4, 99, 3};
        DynamicArray<Integer> myArray = new DynamicArray<>(values);

        System.out.print("Изначальный массив: ");
        myArray.print();

        System.out.println("Массив содержит значение 99? " + myArray.contains(99));
        System.out.println("Массив содержит значение 105? " + myArray.contains(105));

        System.out.println("Длина массива: " + myArray.getLength());
        System.out.println("Сумма элементов массива: " + myArray.sum());
        System.out.println("Произведение элементов массива: " + myArray.product());

        System.out.println("Индекс элемента со значением 12: " + myArray.getIndex(12));

        System.out.println("Максимальное значение: " + myArray.getMax());

        System.out.println("Минимальное значение: " + myArray.getMin());

        System.out.println("Элемент по индексу 4: " + myArray.get(4));


        myArray.removeByIndex(2);
        System.out.print("Массив после удаления элемента по индексу 2: ");
        myArray.print();


        myArray.removeByValue(99);
        System.out.print("Массив после удаления элемента со значением 99: ");
        myArray.print();


        myArray.insert(123);
        System.out.print("Массив после добавления элемента со значением 123: ");
        myArray.print();
        myArray.set(0, 567);
        System.out.print("Массив после изменения элемента по индексу 0 на 567: ");
        myArray.print();

        myArray.bubbleSort();
        System.out.print("Массив после сортировки пузырьком: ");
        myArray.print();


        DynamicArray<Integer> newArray = new DynamicArray<>(values);
        System.out.print("\nИзначальный массив: ");
        newArray.print();
        newArray.selectionSort();
        System.out.print("Массив после сортировки выбором:");
        newArray.print();

        DynamicArray<Integer> array = new DynamicArray<>(values);
        System.out.print("\nИзначальный массив: ");
        array.print();
        array.insertionSort();
        System.out.print("Массив после сортировки вставками: ");
        array.print();

        String[] array2 = {"V", "i", "k", "t", "o","r"};
        DynamicArray<String> strArray = new DynamicArray<>(array2);
        System.out.println("Конкатенация строк: " + strArray.sum());
    }
}
