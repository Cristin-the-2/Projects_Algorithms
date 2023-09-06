package Seminar01;

public class Task01 {
    // Алгоритм считает сумму всех чисел от 1 до Н
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
