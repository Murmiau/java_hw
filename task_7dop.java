import java.util.Scanner;
import java.util.ArrayList;

public class task_7dop {
    public static void main(String[] args) {
        Scanner my_sc = new Scanner(System.in);
        System.out.print("Введите количество элементов списка: ");
        int num = my_sc.nextInt();
        System.out.println("Введите элемент списка: ");
        ArrayList<Integer> my_list = new ArrayList<Integer>();
        ArrayList<Integer> duplicates = new ArrayList<Integer>();
        for (int i = 0; i < num; i++) {
            int a = my_sc.nextInt();
            my_list.add(a);
        }
        my_sc.close();
        System.out.println("Список введеных элементов : " + my_list);
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (my_list.get(i).equals(my_list.get(j))) {
                    duplicates.add(my_list.get(i));
                }
            }
        }
        System.out.println("Список повторяющихся элементов : " + duplicates);
        int dup_size = duplicates.size();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < dup_size; j++) {
                if (my_list.get(i).equals(duplicates.get(j))) {
                    my_list.remove(i);
                    i = 0;
                    --num;
                }
            }
        }
        System.out.println("Список элементов, встречающихся в списке один раз : " + my_list);
    }
}