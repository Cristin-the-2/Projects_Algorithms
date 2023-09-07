package Seminar02;

public class BubbleSort {
    // Пузырьковая сортировка
    public static void main(String[] args) {
        int[] listNumb = new int[(int) (Math.random() * 100)];
        for (int i = 0; i < listNumb.length; i++) {
            listNumb[i] = (int) (Math.random() * 100);
        }

        System.out.println("Unsorted list:");
        for (int i = 0; i < listNumb.length; i++) {
            System.out.print(listNumb[i] + " ");
        }

        for (int i = 0; i < listNumb.length; i++) {
            for (int j = 0; j < listNumb.length - 1; j++) {
                if (listNumb[j] > listNumb[j + 1]) {
                    int temp = listNumb[j];
                    listNumb[j] = listNumb[j + 1];
                    listNumb[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted list:");
        for (int i = 0; i < listNumb.length; i++) {
            System.out.print(listNumb[i] + " ");
        }
    }
}
