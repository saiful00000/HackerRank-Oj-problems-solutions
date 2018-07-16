package String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaStringTokens {

    public static void main(String[] args) {

        Scanner iin = new Scanner(System.in);
        String s = iin.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(s," !,?._'@");

        System.out.println(tokenizer.countTokens());
        while ( tokenizer.hasMoreTokens() )
        {
            String token = (String)tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
