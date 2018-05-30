package Sorting;

import java.util.Scanner;

public class InsertionSort_1 {

    public static void insertionSort(int n, int[] a){
        int unsortedIndex = -1;
        int unsortedValue = -1;
        boolean isInserted = false;

        // find unsorted value and its index
        for(int i=a.length-1; i>0; i--){
            if(a[i]<a[i-1]){
                unsortedIndex = i;
                unsortedValue = a[i];
                break;
            }
        }

        //insert the value into the right position
        for(int i=unsortedIndex; i>=0; i--){
            if(i>0 && a[i-1]>=unsortedValue){
                a[i] = a[i-1];
            }
            else{
                a[i] = unsortedValue;
                isInserted = true;
            }
            for(int j=0; j<n; j++){
                System.out.print(a[j] +" ");
            }
            System.out.println();

            if(isInserted){
                break;
            }

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            a[arr_i] = in.nextInt();
        }
        insertionSort(n, a);
        in.close();
    }

}
