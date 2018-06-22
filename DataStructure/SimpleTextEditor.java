package DataStructure;
import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();

        String str = "";
        Stack<String> stack = new Stack<String>();
        stack.push(str);

        for (int i = 0; i < testCase; i++) {
            int opperation = in.nextInt();
            if (opperation == 1) {
                str = str + in.next();
                stack.push(str);
            } else if (opperation == 2) {
                int numOfChars = in.nextInt();
                str = str.substring(0, str.length() - numOfChars);
                stack.push(str);
            } else if (opperation == 3) {
                int k = in.nextInt();
                System.out.println(str.charAt(k - 1));
            } else {
                stack.pop();
                str = stack.peek();
            }
        }
    }
}
