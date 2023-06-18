import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("введите число А: ");
        double a = iScanner.nextInt();
        System.out.println("введите имя число В: ");
        int b = iScanner.nextInt();
        System.out.println("введите операцию: ");
        char operation = iScanner.next().charAt(0);   
        if(operation == '+') {
            System.out.print(a+b);
        }
         if(operation == '-') {
            System.out.print(a-b);
        }
         if(operation == '*') {
            System.out.print(a * b);
        }
         if(operation == '/') {
            System.out.print(a / b);
        }
        iScanner.close();
    }
}
