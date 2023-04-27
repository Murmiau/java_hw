import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class les4ex2 {
    public static void main(String[] args) {
        Scanner my_sc = new Scanner(System.in);
        boolean work = true;
        LinkedList<String> my_list = new LinkedList<>();
        while (work) {
            System.out.println("Чтобы добавить элемент в конец очереди - введите enqueue; " +
                    "вернуть первый элемент и удалить его - dequeue; вернуть первый элемент, " +
                    "не удаляя - first; \nпосмотреть текущую очередь - watch; очистить текущую " +
                    "очередь - clear; завершить - exit: ");
            String line = my_sc.nextLine();
            switch (line) {
                case "enqueue":
                    enqueue(my_list);
                    break;
                case "dequeue":
                    System.out.println("Удаленный первый элемент: " + dequeue(my_list));
                    break;
                case "first":
                    System.out.println("Первый элемент текущей очереди: " + first(my_list));
                    break;
                case "exit":
                    System.out.println("Вы уверены, что хотите выйти? Введите yes для выхода, " +
                            "no для продолжения работы: ");
                    String really_exit = my_sc.nextLine();
                    if (Objects.equals(really_exit, "yes")) {
                        System.out.println("Спасибо за то, что воспользовались нашей программой, до новых встреч!");
                        work = false;
                        break;
                    } else {
                        System.out.println("Продолжаем работу.");
                        break;
                    }
                case "watch":
                    System.out.println("Текущая очередь: " + my_list);
                    break;
                case "clear":
                    my_list.clear();
                    break;
                default:
                    System.out.println("Вы ввели неверное значение, повторите ввод!");
                    break;
            }
        }
    }

    public static void enqueue(LinkedList<String> my_list) {
        System.out.println("Введите элемент для добавления в очередь: ");
        Scanner my_sc = new Scanner(System.in);
        String add_line = my_sc.nextLine();
        my_list.addLast(add_line);
    }

    public static String dequeue(LinkedList<String> my_list) {
        String result = my_list.pollFirst();
        return result;
    }

    public static String first(LinkedList<String> my_list) {
        String result2 = my_list.getFirst();
        return result2;
    }
}