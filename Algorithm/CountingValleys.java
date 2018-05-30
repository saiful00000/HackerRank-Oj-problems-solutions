package Algorithm;

import java.util.Scanner;

public class CountingValleys {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String str = in.next();
        int count = 0;
        int villatege = 0;

        for(char c: str.toCharArray()){
            if(c == 'U') count++;
            else count--;

            if (count == 0 && c == 'U'){
                villatege++;
            }
        }
        System.out.println(villatege);
    }
}
