package Main.Lesson3;
//Удаление отрицательных значений из массива
//Реализуйте метод, который принимает на вход целочисленный массив и
//удаляет все отрицательные числа. Метод должен вернуть массив, содержащий
//только неотрицательные числа.

import java.util.Arrays;

public class HomeWork1 {
    public static void main(String[] args) {
        int[] a = {2,5,-1,3,-3};
        int[] filter = filter(a);
        System.out.println(Arrays.toString(filter));
    }

    public static int[] filter(int[] input) {
        int[] result = new int[input.length];
        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] >= 0) {
                result[counter++] = input[i];
            }
        }
        return Arrays.copyOf(result,counter);

    }
}
