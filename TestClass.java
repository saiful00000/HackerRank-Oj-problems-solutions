import java.util.Scanner;

public class TestClass {

    static void solution(String s, String ss, int k) {
        int len = s.length() + ss.length();

        while (!s.startsWith(ss)) {
            ss = ss.substring(0,ss.length()-1);
        }

        int len2 = ss.length();

        System.out.println((len <= k+len2*2 && len%2 == k%2 || len < k ? "Yes":"No"));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String ss = in.nextLine();
        int k = in.nextInt();

        solution(s,ss,k);
    }
}