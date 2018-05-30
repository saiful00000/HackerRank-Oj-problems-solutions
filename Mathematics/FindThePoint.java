/*
*This problem is pretty simple math problem
* happy coding
*/

package Mathematics;
import java.util.Scanner;

public class FindThePoint {

    // method to find point
    static void findThePoint(int p1, int p2, int q1, int q2){
        int point1 = 2 * q1 - p1;
        int point2 = 2 * q2 - p2;
        System.out.print(point1 +" "+ point2 +"\n");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=0; i<n; i++) {
            int p1 = in.nextInt();
            int p2 = in.nextInt();
            int q1 = in.nextInt();
            int q2 = in.nextInt();

            findThePoint(p1,p2,q1,q2);
        }
    }
}
