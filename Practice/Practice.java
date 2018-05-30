package Practice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arrTime = new int[n];
        int[] burstTime = new int[n];

        for(int i=0; i<n; i++){
            arrTime[i] = in.nextInt();
        }
        for(int i=0; i<n; i++){
            burstTime[i] = in.nextInt();
        }

        for(int i=1; i<arrTime.length; i++){
            int j = i;
            while (j>0 && arrTime[j-1] > arrTime[j]) {
                int temp = arrTime[j];
                arrTime[j]     = arrTime[j-1];
                arrTime[j-1]   = temp;

                int temp1 = burstTime[j];
                burstTime[j]     = burstTime[j-1];
                burstTime[j-1]   = temp1;

                j--;
            }
        }
        for(int i=0; i<n; i++){
            System.out.println("at = "+ arrTime[i] +" "+"bt = "+ burstTime[i]);
        }

    }
}
