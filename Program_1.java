public class Program_1 {
    public static void main(String[] args) {
        int n = 4;
        int factorial = 1;
        int triangle = 0;
        int i = 1;
        while(i <= n) {
            triangle = triangle + i;
            factorial = factorial * i;
            i++;
        }
        System.out.printf("factorial = %d, triangle = %d", factorial, triangle);
    }
}
