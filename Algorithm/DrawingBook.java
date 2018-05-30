package Algorithm;

import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int totalPageNumber = in.nextInt();
        int pageToOpen = in.nextInt();
        int count1 = 0;
        int count2 = 0;

        System.out.println(Math.min(pageToOpen/2, totalPageNumber/2 - pageToOpen/2));
        /*for (int i=1; i<=totalPageNumber; i++){
            if(i <= pageToOpen){
                count1++;
            }else if (i >= pageToOpen){
                count2++;
            }
        }
        int result;

        if(pageToOpen == 1){
            result = 0;
        }
        else if(count2 == 1 && totalPageNumber % 2 == 0){
            result = 1;
        }
        else if(count1 < count2){
            result = count1/2;
        }
        else{
            result = count2/2;
        }

        System.out.println(result);
        */
    }
}
