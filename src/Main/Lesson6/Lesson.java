package Main.Lesson6;

public class Lesson {
    public static void main(String[] args) {
        int i = 0;
        for (int j = 0; j < 5; j++) {
            i += ++j;
        }
        System.out.println(i);
    }
}
