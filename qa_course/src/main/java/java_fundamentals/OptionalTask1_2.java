package java_fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Вывести числа в порядке возрастания (убывания) значений их длины.

public class OptionalTask1_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Укажите количество чисел: ");
        int amountOfNumbers = Integer.parseInt(reader.readLine());
        String [] strArray = new String [amountOfNumbers];
        System.out.println("Введите числа: ");
        for (int i = 0; i < amountOfNumbers; i++) {
            String inputNumber = reader.readLine();
            strArray[i] =  inputNumber;
        }
        System.out.println("Если вы хотите вывести числа в порядке возрастания их длинны, то введите 1\nЕсли вы хотите " +
                "вывести числа в порядке возрастания их длинны, то введите 2");
        int choise = Integer.parseInt(reader.readLine());
        if (choise == 1) {
            for (int i = 0; i < strArray.length; i++) {
                for (int j = 0; j < strArray.length - 1 - i; j++) {
                    if (strArray[j].length() > strArray[j + 1].length()) {
                        String str = strArray[j];
                        strArray[j] = strArray[j + 1];
                        strArray[j + 1] = str;
                    }
                }
            }
            System.out.println("Числа в порядке возрастания их длинны: ");
            for (String s : strArray) {
                System.out.println(s);
            }
        }else if (choise == 2) {
            for (int i = 0; i < strArray.length; i++) {
                for (int j = 0; j < strArray.length - 1 - i; j++) {
                    if (strArray[j].length() < strArray[j + 1].length()) {
                        String str = strArray[j];
                        strArray[j] = strArray[j + 1];
                        strArray[j + 1] = str;
                    }
                }
            }
            System.out.println("Числа в порядке возрастания их длинны: ");
            for (String s : strArray) {
                System.out.println(s);
            }
        }else {
            System.out.println("Вы ввели неверное число.");
        }
     reader.close();
    }
}
