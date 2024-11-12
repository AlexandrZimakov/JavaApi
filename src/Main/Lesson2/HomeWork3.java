package Main.Lesson2;
//Удаление пустых строк из текста
//Дана строка с несколькими строками текста, разделенными переводами строки.
//        Напишите метод, который удаляет все пустые строки из текста.

public class HomeWork3 {
    public static void main(String[] args) {
        String text = "";
        if (args.length == 0) {
            text = "line1\n\nline2\n\nline3";
        } else {
            text = args[0];
        }
        HomeWork3 ans = new HomeWork3();
        System.out.println(ans.removeEmptyLines(text));
    }
    public static String removeEmptyLines (String param) {
        String [] arr = param.split("\n");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isBlank()){
                result.append(arr[i]);
                if(i< arr.length){
                    result.append("\n");
                }
            }
        }
        return result.toString();

    }
}
