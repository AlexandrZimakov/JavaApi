package Main.Lesson4;
//Реализация стека
//Реализуйте MyStack с использованием LinkedList с методами:
//● push(String element) - добавляет элемент на вершину стека
//● pop() - возвращает элемент с вершины и удаляет его
//● peek() - возвращает элемент с вершины, не удаляя
//● getElements() - возвращает все элементы стека


import java.util.LinkedList;

public class HomeWork2 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("apple");
        stack.push("banana");
        stack.push("pear");
        stack.push("grape");
        System.out.println(stack.getElements());
        System.out.println(stack.pop());
        System.out.println(stack.getElements());
        System.out.println(stack.peek());
    }
    static class MyStack {

        private LinkedList<String> stack = new LinkedList<>();

        public void push(String element) {
            stack.addFirst(element);
        }

        public String pop() {
            return stack.removeFirst();
        }

        public String peek() {
            return stack.peekFirst();
        }

        public LinkedList<String> getElements() {
            return new LinkedList<>(stack);
        }
    }
}
