package Main.Lesson3;
//Уникальные числа
//Напишите метод, который принимает целочисленный массив и возвращает
//новый массив, содержащий только уникальные элементы из исходного
//массива.

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(filter(new int[]{1, 2, 2, 4, 2, 6})));
    }

    public static int[] filter(int[] a) {
        int[] result = new int[a.length];
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            int currentElement = a[i];
            if (checkDublicate(result, currentElement)) {
                result[counter++] = currentElement;
            }
        }
        return Arrays.copyOf(result, counter);
    }

    private static boolean checkDublicate(int[] result, int param) {

        for (int i1 = 0; i1 < result.length; i1++) {

            if (result[i1] == param) {
                return false;
            }
        }
        return true;
    }
}
