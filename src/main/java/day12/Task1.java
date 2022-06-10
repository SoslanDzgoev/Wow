package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Лада");
        list.add("БМВ");
        list.add("Мерседес");
        list.add("Нисан");
        list.add("Тайота");
        System.out.println(list);
        list.add(3, "Лексус");
        list.remove(0);
        System.out.println(list);

    }
}
