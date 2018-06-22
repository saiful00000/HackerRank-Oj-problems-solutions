package DataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class EqualStack {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Queue <Integer> stack1 = new LinkedList<>();
        Queue <Integer> stack2 = new LinkedList<>();
        Queue <Integer> stack3 = new LinkedList<>();
        int sum1 = 0, sum2 = 0, sum3 = 0;

        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        for (int i = 0; i < n1; i++) {
            int height = in.nextInt();
            stack1.add(height);
            sum1 += height;
        }
        for (int i = 0; i < n2; i++) {
            int height = in.nextInt();
            stack2.add(height);
            sum2 += height;
        }
        for (int i = 0; i < n3; i++) {
            int height = in.nextInt();
            stack3.add(height);
            sum3 += height;
        }

        while (true) {
            if (sum1 == 0 || sum2 == 0 || sum3 == 0) {
                System.out.println(0);
                break;
            }
            if (sum1 == sum2 && sum2 == sum3) {
                System.out.println(sum1);
                break;
            }
            if (sum1 >= sum2 && sum1 >= sum3) {
                sum1 -= stack1.remove();
            } else if (sum2 >= sum1 && sum2 >= sum3) {
                sum2 -= stack2.remove();
            } else if (sum3 >= sum1 && sum3 >= sum2) {
                sum3 -= stack3.remove();
            }
        }
    }
}
