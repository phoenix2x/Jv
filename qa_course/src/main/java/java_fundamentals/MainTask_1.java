package java_fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Приветствовать любого пользователя при вводе его имени через командную строку.

public class MainTask_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите важе имя:");
        String name = reader.readLine();
        System.out.println("Привет " + name + "!");
        reader.close();
    }

}
