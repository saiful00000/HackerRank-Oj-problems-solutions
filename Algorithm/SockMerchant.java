package Algorithm;

import java.util.Scanner;
import java.util.Arrays;

public class SockMerchant {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int numberOfSocks = in.nextInt();
        int[] colorArray = new int[numberOfSocks];

        //take input for every color of socks
        for(int i=0; i<numberOfSocks; i++){
            colorArray[i] = in.nextInt();
        }
        Arrays.sort(colorArray);

        int count = 0;
        for (int i=0; i<numberOfSocks-1; i++){
            if(colorArray[i] == colorArray[i+1]){
                count++;
                i++;
            }
        }
        System.out.println(count);
    }
}
