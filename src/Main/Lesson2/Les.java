package Main.Lesson2;

import java.util.Arrays;

public class Les {
    public static void main(String[] args) {
        String data = "p1 p2 p3 p4";
        System.out.println(data);
        String[] split = data.split(" ");
        System.out.println(Arrays.deepToString(split));
        String join = String.join(";", split);
        System.out.println(join);
    }
}
