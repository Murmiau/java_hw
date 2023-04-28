import java.io.IOException;
import java.util.logging.*;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class les2ex6 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(les2ex6.class.getName());
        FileHandler fh = new FileHandler("log.txt");

        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int a = iScanner.nextInt();
        logger.setLevel(Level.INFO);
        logger.log(Level.INFO, String.format("Enter first number = " + a));
        System.out.println("Введите второе целое число: ");
        int b = iScanner.nextInt();
        logger.setLevel(Level.INFO);
        logger.log(Level.INFO, String.format("Enter second number = " + b));
        System.out.println(
                "Выберите операцию и введите символ, сложение +, умножение *, деление /: ");
        String operation = iScanner.next();
        logger.setLevel(Level.INFO);
        logger.log(Level.INFO, String.format("Enter operation: " + operation));
        iScanner.close();
        switch (operation) {
            case "+":
                int result1 = a + b;
                System.out.printf("Cумма чисел: %d", result1);
                logger.setLevel(Level.INFO);
                logger.log(Level.INFO, String.format("plus = " + result1));
                break;
            case "*":
                int result2 = a * b;
                System.out.printf("Произведение чисел: %d", result2);
                logger.setLevel(Level.INFO);
                logger.log(Level.INFO, String.format("multiplication = " + result2));
                break;
            case "/":
                int result3 = a / b;
                int result4 = b / a;
                System.out.printf("Результат деления первого числа на второе: %d, второго на первое: %d", result3,
                        result4);
                logger.setLevel(Level.INFO);
                logger.log(Level.INFO, String.format("division = " + result3 + result4));
                break;
            default:
                System.out.print("Вы ввели неверное значение!" + "\n");
                logger.setLevel(Level.INFO);
                logger.log(Level.INFO, String.format("input error: " + operation));
                break;
        }
    }
}
