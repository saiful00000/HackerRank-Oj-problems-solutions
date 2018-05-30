package Random;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] arga){
        Scanner in = new Scanner(System.in);

        int Da = in.nextInt();
        int Ma = in.nextInt();
        int Ya = in.nextInt();

        int De = in.nextInt();
        int Me = in.nextInt();
        int Ye = in.nextInt();

        int fine = 0;

        if(Ya < Ye) {
            fine = 0;
        }else{
            if(Ya > Ye){
                fine = 10000;
            }else if (Ma > Me){
                fine = (Ma-Me) * 500;
            }else if (Da > De){
                fine = (Da-De) * 15;
            }
        }
        System.out.println(fine);
    }
}
