package Oblig;

import java.util.Arrays;

public class Oppgave_4 {

    public static void delSortering(int[] a) {

        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            while (left <= right && a[left] % 2 != 0) {
                left++;
            }
            while (left <= right && a[right] % 2 == 0) {
                right--;
            }
            if (left < right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
        quicksort(a, 0, left - 1);

        quicksort(a, left, a.length - 1);
    }

    public static void quicksort(int[] a, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(a, low, high);
            quicksort(a, low, pivotIndex - 1);
            quicksort(a, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {


        int[] a = {6, 10, 9, 4, 1, 3, 8, 5, 2, 7};

        delSortering(a);

        System.out.println(Arrays.toString(a));
    }
}
