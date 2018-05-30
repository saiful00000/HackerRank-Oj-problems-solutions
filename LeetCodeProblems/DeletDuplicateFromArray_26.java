package LeetCodeProblems;

import java.util.Arrays;

public class DeletDuplicateFromArray_26 {

    public static int removeDuplicates(int[] nums) {

        int count = nums.length > 0 ? 1 : 0;
        for (int val : nums){
            if(val > nums[count-1]){
                nums[count++] = val;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {1,1,2};
        int result = removeDuplicates(arr);

        System.out.println(result);

    }
}
