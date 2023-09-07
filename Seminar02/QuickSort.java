package Seminar02;

public class QuickSort {
    // Быстрая сортировка
    public static void main(String[] args) {
        int[] listNumb = new int[(int) (Math.random() * 100)];
        for (int i = 0; i < listNumb.length; i++) {
            listNumb[i] = (int) (Math.random() * 100);
        }

        System.out.println("Unsorted list:");
        for (int i = 0; i < listNumb.length; i++) {
            System.out.print(listNumb[i] + " ");
        }

        quickSort(listNumb);

        System.out.println("\nSorted list:");
        for (int i = 0; i < listNumb.length; i++) {
            System.out.print(listNumb[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int startPos, int endPos) {
        int leftPos = startPos;
        int rightPos = endPos;
        int pivot = arr[(startPos + endPos) / 2];

        do {
            while (arr[leftPos] < pivot) {
                leftPos += 1;
            }
            while (arr[rightPos] > pivot) {
                rightPos -= 1;
            }
            if (leftPos <= rightPos) {
                if (leftPos < rightPos) {
                    int temp = arr[leftPos];
                    arr[leftPos] = arr[rightPos];
                    arr[rightPos] = temp;
                }
                leftPos++;
                rightPos--;
            }
        } while (leftPos <= rightPos);
        if (leftPos < endPos) {
            quickSort(arr, leftPos, endPos);
        }
        if (startPos < rightPos) {
            quickSort(arr, startPos, rightPos);
        }
    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
}
