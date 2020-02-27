package java_fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
 Осуществить проверку корректности ввода чисел.
 */

public class MainTask_5 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите номер месяца:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfmonth = Integer.parseInt(reader.readLine());
        switch (numberOfmonth){
            case 1: System.out.println("Январь");
                break;
            case 2: System.out.println("Февраль");
                break;
            case 3: System.out.println("Март");
                break;
            case 4: System.out.println("Апрель");
                break;
            case 5: System.out.println("Май");
                break;
            case 6: System.out.println("Июнь");
                break;
            case 7: System.out.println("Июль");
                break;
            case 8: System.out.println("Август");
                break;
            case 9: System.out.println("Сентябрь");
                break;
            case 10: System.out.println("Октябрь");
                break;
            case 11: System.out.println("Ноябрь");
                break;
            case 12: System.out.println("Декабрь");
                break;
            default: System.out.println("Вы ввели неверно число.");
                break;
        }
            reader.close();
    }
}
