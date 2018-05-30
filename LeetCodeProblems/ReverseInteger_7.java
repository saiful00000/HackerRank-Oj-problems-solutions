package LeetCodeProblems;

import java.util.Scanner;

public class ReverseInteger_7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(true){
            int input = in.nextInt();
            int output = reverseInteger(input);
            System.out.println("Input : " + input + " Output : " + output);
        }
    }
    public static int reverseInteger(int number) {

        boolean isNegative = number < 0 ? true : false;
        if(isNegative){
            number = number * -1;
        }

        int reverse = 0;
         int lastDigit = 0;
        while (number >= 1) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        return isNegative == true? reverse*-1 : reverse;
    }
}
