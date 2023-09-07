package Seminar02;

public class BinarySearch {
    // Бинарный поиск по элементам
    public static void main(String[] args) {
        int[] listNumb = new int[(int) (Math.random() * 100)];
        for (int i = 0; i < listNumb.length; i++) {
            listNumb[i] = (int) (Math.random() * 100);
        }
        int numb = (int) (Math.random() * 100);
        System.out.println("Numb: " + numb);

        QuickSort.quickSort(listNumb);

        System.out.print("Sorted list: ");
        for (int i = 0; i < listNumb.length; i++) {
            System.out.print(listNumb[i] + " ");    
        }

        System.out.println("\nIndex of numb: " + binarySearch(listNumb, numb));
    }

    public static int binarySearch(int[] arr, int numb, int startPos, int endPos) {
        if (startPos > endPos) {
            return -1;
        }
        int index = (endPos - startPos) / 2 + startPos;
        if (arr[index] == numb) {
            while (arr[index] == numb) {
                if (index == 0) {
                    return index;
                }
                index --;
            }
            return index;
        } else {
            if (arr[index] < numb) {
                return binarySearch(arr, numb, index + 1, endPos);
            } else {
                return binarySearch(arr, numb, startPos, index - 1);
            }
        }
    }

    public static int binarySearch(int[] arr, int numb) {
        return binarySearch(arr, numb, 0, arr.length-1);
    }
}
