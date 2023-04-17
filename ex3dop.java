import java.util.Scanner;

public class ex3dop {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println(
                "Загадайте два положительных целых двухзначных числа, сумма чисел которых должна быть меньше 100.");
        System.out.print("Введите первую цифру первого числа: ");
        int a = iScanner.nextInt();
        System.out.print("Введите вторую цифру второго числа: ");
        int b = iScanner.nextInt();
        System.out.print("Введите сумму этих чисел: ");
        int summ = iScanner.nextInt();
        iScanner.close();
        int a2 = (summ - a * 10 - b) % 10;
        int b1 = (summ - a * 10 - b - a2) / 10;
        System.out.printf("Загаданы числа: %d%d + %d%d = %d", a, a2, b1, b, summ);
    }
}