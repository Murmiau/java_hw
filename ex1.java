import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите целое число: ");
        int number = iScanner.nextInt();
        System.out.printf("Треугольное число: %d", triangle(number));
        iScanner.close();
    }

    public static int triangle(int n) {
        return (n * (n + 1)) / 2;
    }
}