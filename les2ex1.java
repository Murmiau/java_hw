import java.util.Scanner;

public class les2ex1 {
    public static void main(String[] args) {
        Scanner my_sc = new Scanner(System.in);
        System.out.print("Введите слово, состоящее из букв A, a, B, b: ");
        String stones = my_sc.next();
        System.out.println(stones);
        my_sc.close();
        String jewels = "aB";
        char[] stones_ch = stones.toCharArray();
        char[] jewel_ch = jewels.toCharArray();
        int count_a = 0;
        int count_B = 0;
        for (char stonesCh : stones_ch) {
            if (stonesCh == jewel_ch[0]) {
                count_a++;
            } else if (stonesCh == jewel_ch[1]) {
                count_B++;
            }
        }
        System.out.printf("Все камни: %s, драгоценные камни: a - %d, B - %d", stones, count_a, count_B);
    }
}
