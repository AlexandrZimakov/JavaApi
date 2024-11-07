package Main.Lesson1;
//Напишите метод factorial, который принимает число n и возвращает его
//факториал. Если число n < 0, метод должен вернуть -1.
public class HomeWork1 {
    public static void main(String[] args){
        System.out.println(factorial(5));
    }

    public static int factorial(int n){
        int result = 1;
        if(n < 0){
            return -1;
        }
        for(int i = 2; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
