package LR1;

public class BinarySearch {
    // Напишите алгоритм бинарного поиска по массиву из 1_000_000 целых чисел двумя способами: 
    // с использованием рекурсии и без использования рекурсии. Сравните их по времени выполнения.

    public static void main(String[] args) {

        // Создание и заполнение массива значенями [1, 1 000 000]
        int[] arr = new int[1_000_000];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;

        // Значение для поиска
        int searchValue = 53_342;   

        // Замер времени алгоритма без рекурсии
        long startTime = System.nanoTime();
        binarySearch(arr, searchValue);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        // Замер времени алгоритма с рекурсией
        startTime = System.nanoTime();
        recursiveBinarySearch(arr, searchValue, 0, arr.length - 1);
        endTime = System.nanoTime();
        long durationRecursive = (endTime - startTime);

        // Результат
        System.out.println("Без рекурсии [наносекунды]: " + duration);          // ~2500 нс
        System.out.println("С рекурсией [наносекунды]: " + durationRecursive);  // ~1500 нс

        // Вывод: в моем случае рекурсивный алгоритм примерно в 2 раза быстрее обычного
    }

    public static int binarySearch(int[] array, int searchValue) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (array[middle] == searchValue)     { return middle; } 
            else if (array[middle] < searchValue) { left = middle + 1; } 
            else if (array[middle] > searchValue) { right = middle - 1; }
        }

        return -1;
    }

    public static int recursiveBinarySearch(int[] array, int searchValue, int left, int right) {
        if (right < left) { return - 1; }

        int middle = left + (right - left) / 2;

        if (array[middle] == searchValue) { 
            return middle; 
        } else if (array[middle] < searchValue) { 
            return recursiveBinarySearch(array, searchValue, middle - 1, right); 
        } else {
            return recursiveBinarySearch(array, searchValue, left, middle + 1);
        }
    }
}
