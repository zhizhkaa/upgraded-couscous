package LR1;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = new int[1_000_000];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;

        int searchValue = 53_342;

        System.out.println(binarySearch(arr, searchValue));

        System.out.println(recursiveBinarySearch(arr, searchValue, 0, arr.length - 1));
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
