import java.util.Scanner;
import java.util.Stack;

public class TestClass {
    public static void main(String[] args){
        Stack <Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int sum = 0;

        sum += stack.peek();

        System.out.println(sum);
    }
}