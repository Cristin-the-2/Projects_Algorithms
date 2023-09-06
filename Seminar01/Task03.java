package Seminar01;

public class Task03 {
    // Алгоритм поиска всех доступных комбинаций для 4 кубиков с 6 гранями
    public static void main(String[] args) {
        int n = 6;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        count += 1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
