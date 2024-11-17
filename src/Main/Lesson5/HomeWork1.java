package Main.Lesson5;

import java.util.ArrayList;
import java.util.HashMap;

//Реализуйте программу для работы с простым справочником студентов.
//Программа должна иметь следующие функции:
//● addStudent(String name, Integer grade): Добавляет или
//обновляет запись о студенте с именем name и оценкой grade. Если
//студент уже существует, обновляет его оценку.
//● findStudent(String name): Находит оценки студента по его имени.
//Если студент существует, возвращает список его оценок. Если нет —
//пустой список.
//● getAllStudents(): Возвращает весь справочник студентов в виде
//HashMap, где ключи — имена студентов, а значения — списки их оценок.
//● removeStudent(String name): Удаляет запись о студенте по имени
//из справочника. Если запись не существует, ничего не происходит
public class HomeWork1 {
    public static void main(String[] args) {
        StudentDirectory directory = new StudentDirectory();
        directory.addStudent("sasha", 14);
        directory.addStudent("masha", 32);
        directory.addStudent("sasha", 54);

        System.out.println(directory.findStudent("sasha"));
        System.out.println(directory.getAllStudents());
        directory.removeStudent("sasha");
        System.out.println(directory.findStudent("sasha"));
        System.out.println(directory.getAllStudents());
    }
    static class StudentDirectory {
        private HashMap<String, ArrayList<Integer>> studentMap = new HashMap<>();

        // Добавляет или обновляет запись о студенте
        public void addStudent(String name, Integer grade) {
            studentMap.computeIfAbsent(name, k -> new ArrayList<>()).add(grade);
        }

        // Находит оценки студента по имени
        public ArrayList<Integer> findStudent(String name) {
            return studentMap.getOrDefault(name, new ArrayList<>());
        }// Возвращает весь справочник студентов

        public HashMap<String, ArrayList<Integer>> getAllStudents() {
            return studentMap;
        }

        // Удаляет запись о студенте по имени
        public void removeStudent(String name) {
            studentMap.remove(name);
        }
    }

}
