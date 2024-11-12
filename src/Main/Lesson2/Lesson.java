package Main.Lesson2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lesson {
    private static Logger logger = Log.log(Lesson.class.getName());

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFileNamesInDir(".")));
        writeFileNamesToFiles(".", "task05.txt");

    }

    public static boolean isPalendrom(String str) {
        str = str.replace(" ", "").replace(",", "").trim().toLowerCase();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            int length = charArray.length;
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                System.out.println("Это не палиндром!");
                return false;
            }
        }
        System.out.println("Это палиндром");
        return true;
    }

    //    Напишите метод, который вернет содержимое текущей папки в виде массива строк.
    public static String[] getFileNamesInDir(String path) {
        File dir = new File(path);
        String[] res = new String[0];
        File[] files;
        if (dir.isDirectory()) {
            files = dir.listFiles();
            if (files != null) {
                res = new String[files.length];
                for (int i = 0; i < files.length; i++) {
                    File f = files[i];
                    String name = f.getName();
                    res[i] = name;
                }
            }
        } else {
            System.out.println(dir.getName() + "Не является файлом.");
        }
        return res;
    }

    //    Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
    public static void writeFileNamesToFiles(String outPath, String inPath) {
        String[] arr = getFileNamesInDir(outPath);
        try {
            FileWriter fw = new FileWriter(inPath, true);
            for (int i = 0; i < arr.length; i++) {
                fw.write(arr[i] + "\n");
            }
            fw.flush();
            if(isThrow()){
                throw new IOException("Фатальная ошибка записи");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи");
            logger.log(Level.INFO,"Привет");
        }

    }
    //Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.
    private static boolean isThrow() {
        int a = 0;
        int b = 2;
        int digit = a + (int) (Math.random() * b);
        System.out.println(digit);
        return digit > 0;
    }
}
