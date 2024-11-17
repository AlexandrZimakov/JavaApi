package Main.Lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//Написать метод, который переводит число из римского формата записи в арабский.
//Например, MMXXII = 2022
public class Seminar2 {
    public static void main(String[] args) {
        System.out.println(romanToArabic("MMMMMDCLXXVIII"));
    }
    static int romanToArabic (String rom){ //MMXXII = 2022
        Map<String,Integer> romanArabic = Map.of(
                "I", 1,
                "V", 5,
                "X", 10,
                "L",50,
                "C",100,
                "D",500,
                "M",1000
        );
        int result = 0;
        List<Integer> numList = new ArrayList<>();
        String[] arr = rom.split("");
        for (int i = 0; i < arr.length; i++) {
            numList.add(romanArabic.get(arr[i]));
        }
        for (int i = 0; i < numList.size() - 1; i++) {
            if(numList.get(i) < numList.get(i + 1))
                result -= numList.get(i);
            else
                result += numList.get(i);
        }
        result += numList.getLast();
        return result;
    }
}
