package Seminar01;

public class Task04 {
    // Алгоритм поиска нужного числа Фибоначчи
    public static void main(String[] args) {
        System.out.println(findFibRec(7));
        System.out.println(findFibFor(7));
    }

    public static int findFibRec(int n) {
        if ((n == 1) || (n == 2)) {
            return 1;
        }
        return findFibRec(n - 1) + findFibRec(n - 2);
    }

    public static int findFibFor(int n) {
        int count = 0;
        int temp = 1;
        for (int i = 0; i < n; i++) {
            int t = count;
            count += temp;
            temp = t;
        }
        return count;
    }
}
