package Java;
import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger number1 = in.nextBigInteger();
        BigInteger number2 = in.nextBigInteger();

        System.out.println(number1.add(number2));
        System.out.println(number1.multiply(number2));
    }
}
