package Main.Lesson3;
//Длина слов
//Реализуйте метод, который принимает на вход массив строк и возвращает
//новый массив, содержащий только строки, длина которых больше 3 символов.


import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(filter(new String[]{"cat", "elephant", "dog", "giraffe"})));
    }

    public static String[] filter(String[] a) {
        String[] str = new String[a.length];
        int j =0;
        for (int i = 0; i < a.length; i++) {
            if(a[i].length() > 3 ){
                str[j++]= a[i];
            }
        }
        return Arrays.copyOf(str,j);
    }

}