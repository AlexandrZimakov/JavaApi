package Main.Lesson1;
import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
//        int[] arr = new int[]{1,2,4,45,23,65};
//        System.out.println(getSumElemsFromAarray(arr));

        String toReverse = "Добро пожаловать на курс java";

    }
    public static String reverse(String str) {
        String[] arr = str.split(" ");
    // [Добро,пожаловать,на ,курс, по ,Java]
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s).append(" ");
        }
    // sb.append(str);
        sb.reverse();
    // for (int i = arr.length - 1; i >=0 ; i--) {
    // sb.append(arr[i]).append(" ");
    // }
        return sb.toString();
    }


    public static int getSumElemsFromAarray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        return sum;
    }


    public static int getSumElemsFromArray(int[][] arr) {
        int sum = 0;

    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // sum += arr[i][j];
    // }
    // }
        for (int[] ints : arr) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }

        return sum;
    }
    public static void GetUserDataFromConsole() {
        System.out.println("Введите данные");
        Scanner sc = new Scanner(System.in);
        String userData = sc.nextLine();
        System.out.printf("%s: %s%n", "Вы ввели", userData);
    }

}
