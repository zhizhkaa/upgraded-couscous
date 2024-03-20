package LR1;

import java.util.ArrayList;
import java.util.List;

public class StringSplit {
    // Напишите алгоритм разбиения строки на слова, не используя метод split().
    public static void main(String[] args) {
        String str = "The  quick  brown fox jumps over the lazy dog";

        List<String> splitStr = mySplit(str, ' ');

        // Оригинальный split
        for (String word : str.split(" ")) {
            System.out.println(word);
        }

        System.out.println("---");

        for (String word : splitStr)
            System.out.println(word);

        // Оригинальный split и моя реализация выдают одинаковый результат с одинаковыми параметрами
    }

    public static List<String> mySplit(String str, char delimiter) {
        List<String> list = new ArrayList<>();
        int start = 0;
        int end = 0;

        //The quick brown

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            end = i; 

            if (c == delimiter) {
                String word = str.substring(start, end);

                if (!word.isBlank()) { list.add(word); }
                
                start = i + 1;
            }
        }

        list.add(str.substring(start, end + 1));

        if (start == 0) {
            list.add(str);
        }

        return list;
    }
    
}
