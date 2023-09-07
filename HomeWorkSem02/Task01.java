package HomeWorkSem02;

public class Task01 {
    public static void main(String[] args) {
        int[] arr = new int[(int) (Math.random() * 100)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println("Unsorted array:");
        printArray(arr);

        PyramidSort ob = new PyramidSort();
        ob.sort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}