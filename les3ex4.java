import java.util.*;

public class les3ex4 {
    public static void main(String[] args) {
        Scanner my_sc = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int capacity = my_sc.nextInt();
        System.out.print("Введите минимальное число: ");
        int minimum = my_sc.nextInt();
        System.out.print("Введите максимальное число: ");
        int maximum = my_sc.nextInt();
        int[] result_array = CreateNewArray(capacity, minimum, maximum);
        System.out.println("Получившийся список: " + Arrays.toString(result_array));
        System.out.println("Список после сортировки: " + Arrays.toString(SortArray(result_array)));
    }

    public static int[] SortArray(int[] result_array) {
        if (result_array == null) {
            return null;
        }
        int array_length = result_array.length / 2;
        if (result_array.length < 2) {
            return result_array;
        }
        if (result_array.length % 2 != 0) {
            array_length += 1;
        }
        int[] array_right = new int[array_length];
        int[] array_left = new int[result_array.length / 2];
        for (int i = 0; i < result_array.length / 2; i++) {
            array_left[i] = result_array[i];
        }
        for (int i = result_array.length / 2; i < result_array.length; i++) {
            array_right[i - result_array.length / 2] = result_array[i];
        }
        return MergeArray(array_right, array_left);
    }

    public static int[] MergeArray(int[] array_right, int[] array_left) {
        int[] final_array = new int[array_right.length + array_left.length];
        int position_right = 0, position_left = 0;
        for (int i = 0; i < final_array.length; i++) {
            if (position_right < array_right.length && position_left < array_left.length) {
                if (array_right[position_right] < array_left[position_left]) {
                    final_array[i] = array_right[position_right];
                    position_right++;
                } else {
                    final_array[i] = array_left[position_left];
                    position_left++;
                }
            } else if (position_right == array_right.length && position_left < array_left.length) {
                final_array[i] = array_left[position_left];
                position_left++;
            } else if (position_right < array_right.length && position_left == array_left.length) {
                final_array[i] = array_right[position_right];
                position_right++;
            } else {
                final_array[i] = 0;
            }
        }
        return final_array;
    }

    public static int[] CreateNewArray(int capacity, int minimum, int maximum) {
        int[] my_array = new Random().ints(capacity, minimum, maximum).toArray();
        return my_array;
    }
}