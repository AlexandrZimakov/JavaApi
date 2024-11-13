package Main.Lesson3;

import java.util.*;

public class Lesson {
    public static void main(String[] args) {
//        StringBuilder day = new StringBuilder("28");
//        StringBuilder month = new StringBuilder("9");
//        StringBuilder year = new StringBuilder("1990");
//        StringBuilder[] date = new StringBuilder[]{day, month, year};
//        List<StringBuilder> d = Arrays.asList(date);
//        System.out.println(d);

//        Random random=new Random();
//        List<Integer> numbers=new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            numbers.add(random.nextInt());
//        }
//        System.out.println(numbers);
//        Collections.sort(numbers);
//        System.out.println(numbers);

//        List<String> planets = List.of("Сатурн", "Марс", "Марс", "Юпитер");
//        List<Integer> counters = new ArrayList<>();
//        List<String> uniquePlanets = new ArrayList<>();
//        for (int i = 0; i < planets.size(); i++) {
//            String planet = planets.get(i);
//            int position = uniquePlanets.indexOf(planet);
//            if (position >= 0) {
//                counters.set(position, counters.get(position) + 1);
//            } else {
//                uniquePlanets.add(planet);
//                counters.add(1);
//            }
//        }
//        printPlanetCount(uniquePlanets, counters);


    }

//    private static void printPlanetCount(List<String> planets, List<Integer> counts) {
//        for (int i = 0; i < planets.size(); i++) {
//            System.out.printf("%-10s : %3d%n", planets.get(i), counts.get(i));
//        }
//    }
}



//{1,1,2,3,4,5,4,4}
//
//
//public static int[] filter (int[] a) {
//    int[] result =new int[a.length];                                             -----      result = {,,,,,,,}
//    int counter = 0;                                                             -----      counter =0
//    for (int i = 0; i < a.length; i++) {                                         цикл при i = 0
//        int currentElement = a[i];                                                 -----     currentElement = a[0] = 1
//        if(checkDublicate(result, currentElement)){                                -----     checkDublicate({,,,,,,,} , 1) = true
//            result [counter++]= currentElement;                                    -----         result[0] = 1;    ---  result = {1,,,,,}
//        }                                                                             при i = 1
//        currentElement = a[1] = 1
//    }                                                                                   checkDublicate({1,,,,,,,} , 1)   =  false
//    после цикла мы получим
//    {1,2}
//    0 1
//    counter = 5
//
//    return Arrays.copyOf(result,2);
//}
//
//private static boolean checkDublicate(int[] result, int param) {                 -------  result = { 1, , , , , , ,} , param = 1
//
//    for (int i1 = 0; i1 < result.length; i1++) {                                 -------  Цикл
//
//        if(result[i1]== param){
//            return false;
//        }
//    }
//    return true;
//}
//
//
//
//
// 0 1 2   3   4
//         {1,2,43,545,6546}
//
//length = 5