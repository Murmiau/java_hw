import java.util.ArrayList;
import java.util.List;

public class ex2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            boolean PrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    PrimeNumber = false;
                    break;
                }
            }
            if (PrimeNumber) {
                nums.add(i);
            }
        }
        System.out.println("Простые числа от 1 до 1000:" + nums);
    }
}