package les5;
import java.util.*;

public class les5ex1 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> phone_book = new HashMap<>();
        Scanner my_sc = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Чтобы добавить контакт - введите add; посмотреть телефонную книгу - watch; " +
                    "найти абонента по фамилии - user; очистить телефонную книгу - clear; завершить - exit: ");
            String line = my_sc.nextLine();
            switch (line) {
                case "add":
                    add_number(phone_book);
                    System.out.println("Контакт добавлен");
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
                    if (phone_book.isEmpty()) {
                        System.out.println("Записей нет.");
                    } else {
                        System.out.println("Телефонный справочник: ");
                        print_book(phone_book);
                    }
                    break;
                case "clear":
                    phone_book.clear();
                    System.out.println("Записи удалены.");
                    break;
                case "user":
                    find_user(phone_book);
                    break;
                default:
                    System.out.println("Вы ввели неверное значение, повторите ввод!");
                    break;
            }
        }
    }

    private static void add_number(Map<String, ArrayList<String>> phone_book) {
        System.out.println("Введите фамилию и номер телефона через пробел: ");
        Scanner my_sc = new Scanner(System.in);
        String add_line = my_sc.nextLine();
        String key = add_line.split(" ")[0];
        String value = add_line.split(" ")[1];
        if (phone_book.containsKey(key)) {
            phone_book.get(key).add(value);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(value);
            phone_book.put(key, list);
        }
    }

    public static void print_book(Map<String, ArrayList<String>> phone_book) {
        for (var item : phone_book.entrySet()) {
            StringBuilder phones = new StringBuilder();
            for (String phone : item.getValue()) {
                phones.append(phone).append(", ");
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    public static void find_user(Map<String, ArrayList<String>> phone_book) {
        System.out.println("Введите фамилию абонента: ");
        Scanner my_sc = new Scanner(System.in);
        String person = my_sc.next();
        if (phone_book.containsKey(person)) {
            StringBuilder phones = new StringBuilder();
            for (String phone : phone_book.get(person)) {
                phones.append(phone).append(", ");
            }
            System.out.printf("%s: %s \n", person, phones);
        } else {
            System.out.println("Абонент не найден в телефонном справочнике!");
        }
    }
}