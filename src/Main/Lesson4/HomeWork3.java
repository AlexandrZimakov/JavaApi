package Main.Lesson4;
//Количество вхождений слова
//Реализуйте метод countOccurrences в классе ListUtils, который
//принимает LinkedList<String> и строку, и возвращает количество
//вхождений строки в список.


import java.util.LinkedList;

public class HomeWork3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        String value;
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("pear");
        list.add("banana");
        value = "apple";
        System.out.println(countOccurrences(list,value));

    }

    public static int countOccurrences(LinkedList<String> list, String value) {
        int count =0;
        for (String s : list) {
            if(s.equals(value)){
                count++;
            }
        }
        return count;
    }
}
