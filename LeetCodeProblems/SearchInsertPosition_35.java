package LeetCodeProblems;

import java.util.Scanner;

public class SearchInsertPosition_35 {

    public static int searchInsert(int[] arr, int terget){

        int low = 0, high = arr.length-1, count = 0;
        while(low<=high){

            if(arr[low] == terget){
                count = low;
                break;
            }
            if(arr[low] > terget){
                break;
            }
            count++;
            low++;
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = new int[] {1,3,5,6};
        int terget1 = 10;

        int result = searchInsert(arr,terget1);
        System.out.println(result);
    }
}
