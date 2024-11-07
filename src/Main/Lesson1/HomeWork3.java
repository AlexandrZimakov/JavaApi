package Main.Lesson1;
//Напишите метод sumDigits, который принимает целое число n и возвращает
//сумму его цифр.

public class HomeWork3 {
    public static void main(String[] args){
        System.out.println(sumDigits(12345));
    }
    public static int sumDigits(int n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
