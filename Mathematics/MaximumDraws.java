package Mathematics;
import java.util.Scanner;

public class MaximumDraws {

    static void maxDraws(int n) {
        int worstCaseRemove = n+1;
        System.out.println(worstCaseRemove);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int i=0; i<t; i++){
            int n = in.nextInt();
            maxDraws(n);
        }
    }
}
