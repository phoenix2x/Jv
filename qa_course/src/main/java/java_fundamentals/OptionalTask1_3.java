package java_fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
 */

public class OptionalTask1_3 {
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
        double average = 0;
        int sum = 0;
        for (int i = 0; i < strArray.length; i++) {
            sum += strArray[i].length();
            average = sum / strArray.length;
        }
        System.out.println("Если вы хотите вывести числа, длинна которых больше средней длинны по всем числам, то введите 1\nЕсли " +
                "вы хотите вывести числа, длинна которых меньше средней длинны по всем числам, то введите 2");
        int choise = Integer.parseInt(reader.readLine());
        if (choise == 1) {
            for (int i = 0; i < strArray.length; i++) {
                if (strArray[i].length() > average) {
                    System.out.println("Длинна числа " + strArray[i] + " больше средней длинны по всем числам," +
                            " его динна " + strArray[i].length() + ".");
                }
                }
            }else if (choise == 2) {
            for (int i = 0; i < strArray.length; i++) {
                if (strArray[i].length() < average) {
                    System.out.println("Длинна числа " + strArray[i] + " менше средней длинны по всем числам," +
                            " его динна " + strArray[i].length() + ".");
                }
            }
        }else {
            System.out.println("Некорректный ввод!");
        }
     reader.close();
    }
}
