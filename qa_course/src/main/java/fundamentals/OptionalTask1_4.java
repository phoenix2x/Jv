package fundamentals;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OptionalTask1_4 {
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
            String str = strArray[i];
            char chArray[] = str.toCharArray();

            int x = 0;
            for (int j = 0; j < strArray[i].length(); j++) {
                int[] intArray = new int[str.length()];
                intArray[j] = Character.getNumericValue(chArray[j]);
                x = intArray[j];
                System.out.println(x);
                break;

            }





            }










//                for (int k = 1; k < intArray.length; k++) {
//
//
////                    if(intArray[k] > intArray[k-1]){
////                System.out.println(strArray[i]);
////
////           }
//
//
//
//
//                }





            }














//        int mas [] = {5, 2, 3, 4, 5};
//
//
//        for (int i = 1; i < mas.length; i++) {
//            if(mas[i] > mas[i-1]){
//                System.out.println("ok");
//
//            } else {
//                System.out.println("no");
//            }
//
//
//            }
//
//
//
//        boolean flag = true;
//        for (int i = 1; i < mas.length; i++) {
//            if(mas[i]<=mas[i-1]){
//                flag = false;
//                break;
//            }
//        }
//        if(flag){
//            System.out.println("Массив является строго возрастающей последовательностью");
//        } else {
//            System.out.println("Массив не является строго возрастающей последовательностью");
//        }
//










//    public static int []  convert(String str) {
//        char chArray[] = str.toCharArray();
//        int[] intArray = new int[str.length()];
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = Character.getNumericValue(chArray[i]);
//        }
//        return intArray;
//
//    }

}
