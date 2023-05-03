package les5;
import java.util.Arrays;
import java.util.Scanner;

public class les5ex3 {
    public static int left(int i) {
        return (2 * i + 1);
    }

    public static int right(int i) {
        return (2 * i + 2);
    }

    public static void change(int[] my_array, int i, int j) {
        int num = my_array[i];
        my_array[i] = my_array[j];
        my_array[j] = num;
    }

    public static void heappy(int[] my_array, int i, int size) {
        int left_result = left(i);
        int right_result = right(i);
        int largest = i;
        if (left_result < size && my_array[left_result] > my_array[i]) {
            largest = left_result;
        }
        if (right_result < size && my_array[right_result] > my_array[largest]) {
            largest = right_result;
        }
        if (largest != i) {
            change(my_array, i, largest);
            heappy(my_array, largest, size);
        }
    }

    public static int del(int[] my_array, int size) {
        if (size <= 0) {
            return -1;
        }
        int num = my_array[0];
        my_array[0] = my_array[size - 1];
        heappy(my_array, 0, size - 1);
        return num;
    }

    public static void HeapSort(int[] my_array) {
        int n = my_array.length;
        int i = (n - 2) / 2;
        while (i >= 0) {
            heappy(my_array, i--, n);
        }
        while (n > 0) {
            my_array[n - 1] = del(my_array, n);
            n--;
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите числа через пробел: ");
        Scanner my_sc = new Scanner(System.in);
        String numbers = my_sc.nextLine();
        String[] list_numbers = numbers.split(" ");
        int[] new_numbers = new int[list_numbers.length];
        for (int i = 0; i < list_numbers.length; i++) {
            new_numbers[i] = Integer.parseInt(list_numbers[i]);
        }
        System.out.println("Список до сортировки:\n" + Arrays.toString(new_numbers));
        HeapSort(new_numbers);
        System.out.println("Список после сортировки: ");
        for (int numb : new_numbers)
            System.out.printf("%d ", numb);
    }
}