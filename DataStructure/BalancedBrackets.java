package DataStructure;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    static String balanceBracket(StringBuilder str) {
        int n = str.length();
        Stack <Character> stack = new Stack<Character>();

        if (n % 2 != 0) {
            return "NO";
        } else {
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '(')
                    stack.push(str.charAt(i));
                else if (str.charAt(i) == ']') {
                    if(stack.isEmpty() || stack.peek() != '[')
                        return "NO";
                    stack.pop();
                }else if (str.charAt(i) == '}') {
                    if(stack.isEmpty() || stack.peek() != '{')
                        return "NO";
                    stack.pop();
                }else if (str.charAt(i) == ')') {
                    if(stack.isEmpty() || stack.peek() != '(')
                        return "NO";
                    stack.pop();
                }
            }
        }
        return stack.isEmpty() ? "Yes" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder(in.next());
            System.out.println(balanceBracket(str));
        }
    }
}
