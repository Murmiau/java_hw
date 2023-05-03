package les5;
public class les5ex4 {
    public static void main(String[] args) {
        int[] queen = new int[8];
        find_position(0, queen);
        for (int result = 0; result < 8; result++) {
            for (int line = 0; line < 8; line++) {
                if (queen[result] == line) {
                    System.out.print(" Ф ");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
    static boolean find_position(int result, int[] queen) {
        if (result == 8) {
            return true;
        }
        for (int line = 0; line < 8; line++) {
            boolean ready = true;
            for (int i = 0; i < result; i++) {
                if (queen[i] == line || queen[i] == line - result + i || queen[i] == line + result - i) {
                    ready = false;
                    break;
                }
            }
            if (ready) {
                queen[result] = line;
                if (find_position(result + 1, queen)) {
                    return true;
                }
            }
        }
        return false;
    }
}