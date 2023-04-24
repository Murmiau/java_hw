import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class les3ex1 {
    public static void main(String[] args) {
        Scanner my_sc = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int capacity = my_sc.nextInt();
        System.out.print("Введите минимальное число: ");
        int minimum = my_sc.nextInt();
        System.out.print("Введите максимальное число: ");
        int maximum = my_sc.nextInt();
        List<Integer> result_list = CreateNewList(capacity, minimum, maximum);
        System.out.println("Cписок случайных элементов в заданном диапазоне: " + result_list);
        for (int i = 0; i < result_list.size(); i++) {
            if (result_list.get(i) % 2 == 0) {
                result_list.remove(result_list.get(i));
                i--;
            }
        }
        System.out.println("Список, из которого убрали четные элементы: " + result_list);
    }

    public static List<Integer> CreateNewList(int capacity, int minimum, int maximum) {
        List<Integer> my_list = new ArrayList<>(capacity);
        Random random = new Random();
        for (int i = 0; i < capacity; i++) {
            my_list.add(random.nextInt(minimum, maximum));
        }
        return my_list;
    }
}