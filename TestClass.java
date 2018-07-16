import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class TestClass {

    public static String getUserName(String name) {
        String userName = "";
        for (int i = 0; i < name.length(); i++) {
            if ((name.charAt(i) > 96 && name.charAt(i) < 123)) {
                userName += name.charAt(i);
            }
            if ((name.charAt(i) > 64 && name.charAt(i) < 91)) {
                userName += name.charAt(i);
            }
            if (name.charAt(i) == '_') {
                userName += name.charAt(i);
            }
            if ((name.charAt(i) > 47 && name.charAt(i) < 58)) {
                userName += name.charAt(i);
            }
        }
        return userName;
    }

    public static void main(String[] args) {
        System.out.println(getUserName("Samantha_21"));
    }
}