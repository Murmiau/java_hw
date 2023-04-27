import java.util.*;

public class les4ex3 {
    public static void main(String[] args) {
        Scanner my_sc = new Scanner(System.in);
        LinkedList<Integer> my_list = new LinkedList<>();
        System.out.print("Введите количество чисел, которое собираетесь ввести: ");
        int num = my_sc.nextInt();
        my_sc.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.print("Введите число: ");
            my_list.add(my_sc.nextInt());
        }
        my_sc.close();
        List<Integer> new_list = new ArrayList<>();
        int summ = 0;
        ListIterator<Integer> iterator = my_list.listIterator();
        while (iterator.hasNext()) {
            int a = iterator.next();
            new_list.add(a);
            summ += a;
        }
        System.out.println("Список сохраненных элементов: " + new_list);
        System.out.println("Сумма всех элементов: " + summ);
    }
}