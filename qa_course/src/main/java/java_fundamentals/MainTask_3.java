package java_fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
 */

public class MainTask_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Задайте количество случаных чисел: ");
        int amountOfNumbers = Integer.parseInt(reader.readLine());
        int [] array = new int [amountOfNumbers];
        for (int i = 0; i < amountOfNumbers; i++) {
            array [i] = (int) (Math.random()*(600+1)) - 400;
        }
        System.out.println("Введите 1, чтобы вывести числа с переходом на новую строку.\n" +
                "Введите 2, чтобы вывести числа без перехода на новую строку.");
        int choice = Integer.parseInt(reader.readLine());
        if (choice == 1 || choice == 2) {
            for (int i = 0; i < amountOfNumbers; i++) {
               if (choice == 1) {
                   System.out.println(array[i]);
               }else {
                   System.out.print(array[i] + " ");
               }
            }
            }else{
            System.out.println("Введите 1 или 2!");
        }
     reader.close();
    }
}
