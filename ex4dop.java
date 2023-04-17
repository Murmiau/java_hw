import java.util.Scanner;

public class ex4dop {
    public static void main(String[] args) {
        Scanner my_sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int num = Integer.parseInt(my_sc.nextLine());
        int[] my_array = new int[num];
        int summa = 0;
        for (int i = 0; i < num; i++) {
            System.out.print("Введите элемент массива: ");
            my_array[i] = Integer.parseInt(my_sc.nextLine());
            if (i % 2 == 0) {
                summa += my_array[i];
            }
        }
        my_sc.close();
        System.out.println("Сумма элементов массива с четными индексами: " + summa);
        System.out.print("Элементы массива с четными индексами: ");
        for (int i = 0; i < num; i += 2) {
            System.out.print(my_array[i] + "; ");
        }
    }
}