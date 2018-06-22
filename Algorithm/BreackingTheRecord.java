package Algorithm;

import java.util.Scanner;

public class BreackingTheRecord {

    static void breakingTheRecords(int[] arr, int n) {
        int max = arr[0], maxcount = 0;
        int min = arr[0], mincount = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxcount++;
            } else if (arr[i] < min) {
                min = arr[i];
                mincount++;
            }
        }
        System.out.println(maxcount +" "+ mincount);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int game = in.nextInt();
        int[] arr = new int[game];

        for (int i = 0; i < game; i++) {
            arr[i] = in.nextInt();
        }

        breakingTheRecords(arr, game);
    }
}
