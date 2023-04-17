import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int a = iScanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int b = iScanner.nextInt();
        System.out.print(
                "Выберите операцию и введите символ, сложение +, умножение *, деление /, остаток от деления % , вычитание - :");
        String operation = iScanner.next();
        iScanner.close();
        switch (operation) {
            case "+":
                System.out.printf("Cумма чисел: %d", a + b);
                break;
            case "*":
                System.out.printf("Произведение чисел: %d", a * b);
                break;
            case "/":
                System.out.printf("Результат деления первого числа на второе: %d, второго на первое: %d", a / b, b / a);
                break;
            case "%":
                System.out.printf("Остаток от деления первого числа на второе: %d, второго на первое: %d", a % b,
                        b % a);
                break;
            case "-":
                System.out.printf("Результат вычитания второго числа из первого: %d, первого из второго: %d", a - b,
                        b - a);
                break;
            default:
                System.out.printf("Вы ввели неверное значение!");
                break;
        }
    }
}