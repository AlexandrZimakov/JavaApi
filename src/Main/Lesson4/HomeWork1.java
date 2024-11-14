package Main.Lesson4;
//Удаление нечетных строк
//Дан LinkedList с несколькими элементами. В методе
//removeOddLengthStrings класса LLTasks реализуйте удаление строк, длина
//которых нечетная. Используйте LinkedList и стандартные методы.


import java.util.LinkedList;

public class HomeWork1 {
    public static void main(String[] args) {
        LinkedList<String> qq = new LinkedList<>();
        qq.add("qeqwe");
        qq.add("qwsdcqwre");
        qq.add("vfbretwevr");
        removeOddLengthStrings(qq);
        System.out.println(qq);

    }
    public static void removeOddLengthStrings(LinkedList<String> ll) {
        LinkedList<String> toRemove = new LinkedList<>();
        for (String s : ll) {
            if (s.length() % 2 != 0) {
                toRemove.add(s);
            }
        }
        ll.removeAll(toRemove);
    }
}
