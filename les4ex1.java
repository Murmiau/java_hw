import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class les4ex1 {
    public static void main(String[] args) {
        Scanner my_sc = new Scanner(System.in);
        LinkedList<String> my_list = new LinkedList<>();
        System.out.print("Введите количество слов/предложений, которое собираетесь ввести: ");
        int num = my_sc.nextInt();
        my_sc.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.print("Введите слово/предложение: ");
            my_list.add(my_sc.nextLine());
        }
        my_sc.close();
        System.out.println("Исходный список: " + my_list);
        LinkedList<String> reversed_list = new LinkedList<>();
        ListIterator<String> iterator = my_list.listIterator(my_list.size());
        while (iterator.hasPrevious()) {
            reversed_list.add(iterator.previous());
        }
        System.out.println("Перевернутый список: " + reversed_list);
    }
}