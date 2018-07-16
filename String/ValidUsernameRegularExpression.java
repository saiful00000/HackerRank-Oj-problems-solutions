package String;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidUsernameRegularExpression {

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
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int j = 0; j < n; j++) {
            String name = in.nextLine();
            System.out.println(getUserName(name));
            String userName;

            if (name.length() > 7 && name.length() < 31) {
                userName = getUserName(name);
                if (name.length() == userName.length()) {
                    if (userName.charAt(0) == '_' || (userName.charAt(0) > 47 && userName.charAt(0) < 58)) {
                        System.out.println("Invalid");
                    } else {
                        System.out.println("Valid");
                    }
                } else {
                    System.out.println("Invalid");
                }

            } else {
                System.out.println("Invalid");
            }
        }
    }
}
