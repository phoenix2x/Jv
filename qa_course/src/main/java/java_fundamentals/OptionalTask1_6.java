package java_fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
 */

public class OptionalTask1_6 {
    public static void main (String [] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Укажите количество чисел: ");
        int amountOfNumbers = Integer.parseInt(reader.readLine());
        String [] strArray = new String [amountOfNumbers];
        System.out.println("Введите числа: ");
        for (int i = 0; i < amountOfNumbers; i++) {
            strArray[i] = reader.readLine();
        }
        for (int i = 0; i < strArray.length; i++) {
            char chArray[] = strArray[i].toCharArray();
             boolean flag = true;
            for (int j = 1; j < chArray.length; j++) {
                int currNumber = Character.getNumericValue(chArray[j]);
                int prevNumber = Character.getNumericValue(chArray[j-1]);
                if (currNumber <= prevNumber){
                    flag = false; break; }
                }
                if (flag) {System.out.println( "Число, цифры в котором идут в строгом порядке возрастания: "
                        + strArray[i]); break;}
            }
       }

}
