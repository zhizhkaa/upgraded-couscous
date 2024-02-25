package LR1;

import java.util.ArrayList;
import java.util.List;

public class StringSplit {
    // Напишите алгоритм разбиения строки на слова, не используя метод split().
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";

        String[] splitStr = mySplit(str, ' ');

        for (String word : splitStr)
            System.out.println(word);
    }

    public static String[] mySplit(String str, char delimiter) {
        List<String> list = new ArrayList<>();
        int start = 0;
        int end = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            end = i; 

            if (c == delimiter) {
                list.add(str.substring(start, end));
                start = i + 1;
            }
        }

        list.add(str.substring(start, end + 1));

        if (start == 0) {
            list.add(str);
        }

        return list.toArray(new String[0]);
    }
    
}
