package String;
import java.util.Arrays;
import java.util.Scanner;

public class TwoStrings {

    public static boolean commonString(String s1, String s2) {
        boolean[] v = new boolean[26];
        Arrays.fill(v,false);

        for (int i = 0; i < s1.length(); i++) {
            v[s1.charAt(i) - 'a'] = true;
        }

        for (int i = 0; i < s2.length(); i++) {
            if (v[s2.charAt(i) - 'a']) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();

        for (int i = 0; i < testCase; i++) {
            String s1 = in.next();
            String s2 = in.next();

            if (commonString(s1,s2))
                System.out.println("YES");
            else if (!commonString(s1,s2))
                System.out.println("NO");
        }
    }
}
