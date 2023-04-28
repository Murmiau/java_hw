import java.util.Scanner;

public class les2ex2 {
    public static void main(String[] args) {
        Scanner my_sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String my_str = my_sc.nextLine();
        System.out.printf("Строка, введенная пользователем: %s", my_str + "\n");
        int[] my_index = new int[my_str.length()];
        int count = my_str.length();
        for (int i = 0; i < my_str.length(); i++) {
            my_index[i] = count - 1;
            count -= 1;
        }
        System.out.printf("Получившаяся строка: %s", ChangeStr(my_str, my_index));
    }

    public static String ChangeStr(String my_str, int[] my_index) {
        char[] my_char = my_str.toCharArray();
        char[] result_char = new char[my_char.length];
        for (int i = 0; i < my_index.length; i++) {
            result_char[my_index[i]] = my_char[i];
        }
        return new String(result_char);
    }
}