package HomeWorkSem02;

public class Task01 {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        PyramidSort ob = new PyramidSort();
        ob.sort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}