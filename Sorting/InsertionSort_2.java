package Sorting;

import java.util.Scanner;

public class InsertionSort_2 {

    public static void insertionSort(int n, int[] a){

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                int key = a[i+1];

                //when both index are same break the loop
                if(i+1 == j){
                    break;
                }
                if(a[j] > key){
                    a[i+1] = a[j];
                    a[j] = key;
                }
            }
            for(int k=0; k<n; k++){
                System.out.print(a[k] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int arr_i=0; arr_i<n; arr_i++){
            a[arr_i] = in.nextInt();
        }
        insertionSort(n, a);
    }
}
