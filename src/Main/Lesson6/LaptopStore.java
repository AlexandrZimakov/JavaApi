package Main.Lesson6;

import java.util.*;


public class LaptopStore {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop(8,512,2080,"Windows 10","Black"));
        laptops.add(new Laptop(32,256,3070,"Windows 11","White"));
        laptops.add(new Laptop(16,512,3080,"Windows 11","Gray"));
        laptops.add(new Laptop(8,1024,2070,"Windows 10","Green"));
        laptops.add(new Laptop(32,1024,3090,"Windows 11","Black"));
        Map<Integer,String> criteria = new HashMap<>();
        criteria.put(1,"ОЗУ");
        criteria.put(2, "Объем ЖД");
        criteria.put(3, "Видео карта");
        criteria.put(4, "Операционная система");
        criteria.put(5, "Цвет");
        Scanner scanner = new Scanner(System.in);
        Map<String,Object> filters = new HashMap<>();
        boolean continueFiltering = true;
        while (continueFiltering) {
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            for(Map.Entry<Integer, String> entry : criteria.entrySet()){
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
            int criterion = scanner.nextInt();
            scanner.nextLine();
            switch (criterion) {
                case 1:
                    System.out.println("Введите минимальное значение ОЗУ (в ГБ): ");
                    filters.put("ram", scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Введите минимальное значение объема ЖД (в ГБ): ");
                    filters.put("hdd", scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Введите минимальное значение видеокарты (номер): ");
                    filters.put("videoCard", scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Введите операционную систему: ");
                    filters.put("os", scanner.nextLine());
                    break;
                case 5:
                    System.out.println("Введите цвет: ");
                    filters.put("color", scanner.nextLine());
                    break;
                default:
                    System.out.println("Некорректные критерии.");
            }
            System.out.println("Хотите добавить еще один критерий? (да/нет)");
            String response = scanner.nextLine();
            continueFiltering = response.equalsIgnoreCase("да");
        }
        filterLaptops(laptops, filters);
    }
    public static void filterLaptops(Set<Laptop> laptops, Map<String,Object> filters) {
        for (Laptop laptop : laptops) {
            boolean matches = true;
            if (filters.containsKey("ram") && laptop.getRam() < (int) filters.get("ram")){
                matches = false;
            }
            if (filters.containsKey("hdd") && laptop.getHdd() < (int) filters.get("hdd")) {
                matches = false;
            }
            if (filters.containsKey("videoCard") && laptop.getVideoCard() < (int) filters.get("videoCard")) {
                matches = false;
            }
            if (filters.containsKey("os") && !laptop.getOs().equalsIgnoreCase((String) filters.get("os"))) {
                matches = false;
            }
            if (filters.containsKey("color") && !laptop.getColor().equalsIgnoreCase((String) filters.get("color"))) {
                matches = false;
            }
            if (matches) {
                System.out.println(laptop);
            }
        }
    }
}