package Algorithm;
import java.util.Arrays;
import java.util.Scanner;

public class BirthdayChocolate {
    static void birthdayChocolate(int n, int[] arr, int month, int day) {
        int count = 0;
        for (int i = 0; i <= n-month; i++) {
            if(Arrays.stream(arr, i, i+month).sum() == day)
                count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int day = in.nextInt();
        int month = in.nextInt();

        birthdayChocolate(n,arr,month,day);
    }
}
