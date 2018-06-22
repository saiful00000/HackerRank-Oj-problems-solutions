package DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class GameOfTwoStacks {

    public static int score(int[] arr1, int[] arr2, int givenSUm) {

        int count = 0;

        Stack <Integer> stack1 = new Stack <Integer>();
        Stack <Integer> stack2 = new Stack <Integer>();
        for (int i = arr1.length-1; i >= 0 ; i--) {
            stack1.push(arr1[i]);
        }
        for (int i = arr2.length-1; i >= 0 ; i--) {
            stack2.push(arr2[i]);
        }
        int currentSum = 0, numOfMove = 0;
        while (currentSum <= givenSUm) {
            int sum1 = currentSum, sum2 = currentSum;
            if (!stack1.isEmpty() || !stack2.isEmpty()) {
                if (!stack1.isEmpty() && !stack2.isEmpty()) {
                    int a = stack1.peek();
                    int b = stack2.peek();
                    if (a <= b) {
                        sum1 += stack1.peek();
                        if (sum1 <= givenSUm) {
                            numOfMove++;
                            currentSum += stack1.pop();
                            System.out.println(currentSum);
                            System.out.println(numOfMove);
                        }else break;
                    } else {
                        sum2 = stack2.peek();
                        if (sum2 <= givenSUm) {
                            numOfMove++;
                            currentSum += stack2.pop();
                            System.out.println(currentSum);
                            System.out.println(numOfMove);
                        }else break;
                    }
                }
                else if (!stack1.isEmpty()) {
                    sum1 += stack1.peek();
                    if (sum1 <= givenSUm) {
                        numOfMove++;
                        currentSum += stack1.pop();
                        System.out.println(currentSum);
                        System.out.println(numOfMove);
                    }else break;
                } else if(!stack2.isEmpty()) {
                    sum2 = stack2.peek();
                    if (sum2 <= givenSUm) {
                        numOfMove++;
                        currentSum += stack2.pop();
                        System.out.println(currentSum);
                        System.out.println(numOfMove);
                    }else break;
                }
            }
            count = numOfMove;
        }
        System.out.println(count);
        return 100;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfGame = in.nextInt();

        for (int it = 0; it < numOfGame; it++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int givenSum = in.nextInt();

            int[] arr1 = new int[n];
            int[] arr2 = new int[m];

            for (int i = 0; i < n; i++) {
                arr1[i] = in.nextInt();
            }
            for (int i = 0; i < m; i++) {
                arr2[i] = in.nextInt();
            }

            System.out.println(score(arr1,arr2,givenSum));
        }
    }
}
