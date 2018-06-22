package Mathematics;

import java.util.Scanner;

public class MinimumHeightTriangle {

    static int minimumHeight(int base, int area) {
        int result = (int) Math.ceil(((double) 2*area)/base);
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int base = in.nextInt();
        int area = in.nextInt();

        int height = minimumHeight(base, area);
        System.out.println(height);
    }
}
