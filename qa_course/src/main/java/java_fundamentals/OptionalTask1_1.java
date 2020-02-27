package java_fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */

public class OptionalTask1_1 {
    public static void main(String[] args) throws IOException {
        int min = Integer.MAX_VALUE;
        String minStrNumber = null;
        int max = Integer.MIN_VALUE;
        String maxStrNumber = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Укажите количество чисел: ");
        int amountOfNumbers = Integer.parseInt(reader.readLine());
        System.out.println("Введите числа: ");
        for (int i = 0; i < amountOfNumbers; i++) {
            String inputNumber = reader.readLine();
            if(inputNumber.length() < min) {
                minStrNumber = inputNumber;
                min = inputNumber.length();
            }
            if(inputNumber.length() > max) {
                maxStrNumber = inputNumber;
                max = inputNumber.length();
            }
        }
        System.out.println("Число " + minStrNumber + " имеет минимальную длнну из введенных, состоит из " + min
                + " цифр.\nЧисло " + maxStrNumber + " имеет максимальную длнну из введенных, состоит из " + max
                + " цифр.");
      reader.close();
    }
}
