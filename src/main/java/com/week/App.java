package com.week;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Lunes");
        list.add("Martes");
        list.add("Miércoles");
        list.add("Jueves");
        list.add("Viernes");
        list.add("Sábado");
        list.add("Domingo");
        list.size();
        list.remove(3);
        Collections.sort(list);
        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println(list.get(i));
        }
        for (String nombre : list) {
            System.out.println(nombre);
        }
        System.out.println(list.size());
        System.out.println(list.contains("Lunes"));

    }
}
