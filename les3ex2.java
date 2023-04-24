import java.util.*;

public class les3ex2 {
    public static void main(String[] args) {
        Scanner my_sc = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int capacity = my_sc.nextInt();
        System.out.print("Введите минимальное число: ");
        int minimum = my_sc.nextInt();
        System.out.print("Введите максимальное число: ");
        int maximum = my_sc.nextInt();
        List<Integer> result_list = CreateNewList(capacity, minimum, maximum);
        System.out.println("Список случайных элементов в заданном диапазоне: " + result_list);
        int summ = 0;
        for (int i = 0; i < capacity; i++) {
            summ += result_list.get(i);
        }
        int max_value = Collections.max(result_list);
        int min_value = Collections.min(result_list);
        System.out.printf("Среднее арифметическое число: %.1f \nМаксимальное число: %d \nМинимальное число: %d",
                (double) summ / capacity, max_value, min_value);
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