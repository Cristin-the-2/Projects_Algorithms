package Seminar01;

public class Task04 {
    // Алгоритм поиска нужного числа Фибоначчи
    public static void main(String[] args) {
        System.out.println(find_fib_rec(7));
        System.out.println(find_fib_for(7));
    }

    public static int find_fib_rec(int n) {
        if ((n == 1) || (n == 2)) {
            return 1;
        }
        return find_fib_rec(n - 1) + find_fib_rec(n - 2);
    }

    public static int find_fib_for(int n) {
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
