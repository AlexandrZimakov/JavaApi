package Main.Lesson6;
//Задание 1. Поиск ноутбуков
//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
//методы.
//-Создать множество ноутбуков.
//-Написать метод, который будет запрашивать у пользователя критерий (или
// критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии
//фильтрации можно хранить в Map.
//Например:
//Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//-Далее нужно запросить минимальные значения для указанных критериев -
//сохранить параметры фильтрации можно также в Map.
//-Отфильтровать ноутбуки их первоначального множества и вывести проходящие
//по условиям.

import java.util.Objects;

public class Laptop {
    private final int ram;
    private final int hdd;
    private final int videoCard;
    private final String os;
    private final String color;

    public Laptop(int ram, int hdd, int videoCard, String os, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.videoCard = videoCard;
        this.os = os;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public int getVideoCard() {
        return videoCard;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Laptop{" +
                "RAM=" + ram + " GB" +
                ", HDD=" + hdd + " GB" +
                ", VideoCard=" + videoCard +
                ", OS=" + os + "\'" +
                ", Color=" + color + "\'" +
                "}";
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Laptop laptop = (Laptop) obj;
        return ram == laptop.ram && hdd == laptop.hdd && videoCard == laptop.videoCard && Objects.equals(os, laptop.os) && Objects.equals(color, laptop.color);
    }

    public int hashCode() {
        return Objects.hash(ram, hdd, videoCard, os, color);
    }
}
