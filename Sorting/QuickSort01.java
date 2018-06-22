package Sorting;

import java.util.Scanner;
import java.util.Vector;

public class QuickSort01 {

    public static int[] quickSort(int[] arr) {
        Vector <Integer> v = new Vector<Integer>();
        Vector <Integer> left = new Vector<Integer>();
        Vector <Integer> right = new Vector<Integer>();
        final int pvt = arr[0];
        right.add(pvt);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < pvt)
                left.add(arr[i]);
            else if (arr[i] > pvt)
                right.add(arr[i]);
        }
        v.addAll(left);
        v.addAll(right);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = v.get(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] a = quickSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(a[i] +" ");
        }
    }
}
