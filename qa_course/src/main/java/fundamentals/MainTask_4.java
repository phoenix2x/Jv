package fundamentals;

//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

public class MainTask_4 {

    public static void main(String[] args) {
        int sum = 0;
        int product = 1;
        System.out.print ("Аргументы командной строки: ");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
            int number = Integer.parseInt(args[i]);
            sum+=number;
            product*=number;
        }
        System.out.println();
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
    }
}
