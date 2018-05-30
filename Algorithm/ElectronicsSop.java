package Algorithm;

import java.util.Scanner;

public class ElectronicsSop {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);

        int money = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();

        int[] keyboards = new int[n];
        int[] USB = new int[m];

        for (int i=0; i<n; i++){
            keyboards[i] = in.nextInt();
        }
        for (int i=0; i<m; i++){
            USB[i] = in.nextInt();
        }

        int max = 0;
        int moneySpent = -100;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                max = keyboards[j] + USB[i];
                if (max > moneySpent && max <= money){
                    moneySpent = max;
                }
            }
        }

        if(moneySpent==-100){
            System.out.println(-1);
        }else{
            System.out.println(moneySpent);
        }
    }
}
