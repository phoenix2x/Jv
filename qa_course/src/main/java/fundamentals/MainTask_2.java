package fundamentals;

//Отобразить в окне консоли аргументы командной строки в обратном порядке.

public class MainTask_2 {
    public static void main(String[] args) {
        System.out.print("Аргументы командной строки: ");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
        System.out.print("Аргументы командной строки в обратном порядке: ");
        for (int i = args.length - 1; i >= 0 ; i--) {
            System.out.print(args [i] + " ");
        }
    }
}
