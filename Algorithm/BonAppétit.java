package Algorithm;
import java.util.Scanner;

public class BonAppétit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        int taka = 0;

        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
            if(i != k){
                taka += a[i];
            }
        }
        int brinePaid = in.nextInt();
        taka = taka/2;
        if(taka == brinePaid){
            System.out.println("Bon Appetit");
        }
        else {
            System.out.println(brinePaid-taka);
        }
    }
}
