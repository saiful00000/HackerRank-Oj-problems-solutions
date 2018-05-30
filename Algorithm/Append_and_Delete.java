package Algorithm;

import java.util.Scanner;

public class Append_and_Delete {

    public static boolean isPossible(String s, String ss, int count) {
        while (count > 0) {
            if (s == ss)
                return true;
            if (s.length() >= ss.length() && s != ss) {
                if (s.startsWith(ss)) {
                    ss += s.charAt(ss.length());
                    count--;
                } else {
                    ss = ss.substring(0, ss.length() - 1);
                    count--;
                }
            } else {
                while(s.length() < ss.length()){
                    ss = ss.substring(0,ss.length()-1);
                    count--;
                }
            }
        }
        System.out.println(s);
        System.out.println(ss);
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "hackerhappy";
        String ss = "hackerrank";
        int count = 9;

        boolean result = isPossible(s, ss, count);

        if (result) {
            System.out.println("yes");
        } else {
            System.out.println("NO");
        }
    }
}
