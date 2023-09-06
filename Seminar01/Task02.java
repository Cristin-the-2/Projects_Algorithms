package Seminar01;

public class Task02 {
    // Алгоритм поиска простых чисел от 1 до Н
    public static void main(String[] args) {
        int n = 20;

        for (int i = 1; i <= n; i++) {
            boolean flag = true;
            for (int j = 2; j < (i / 2) + 1; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}
