package Mathematics;

import java.util.Scanner;

public class Handshake {

    static int countHandshake(int n) {
        int result = (n*(n-1)/2);

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0){
            int n = in.nextInt();

            int result = countHandshake(n);
            System.out.println(result);

            t--;
        }
    }
}
