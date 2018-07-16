package DataStructure;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String,String> phoneBook = new HashMap<>();
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            String number = in.next();
            phoneBook.put(name,number);
            in.nextLine();
        }
        while (in.hasNext()){
            String query = in.nextLine();
            if (phoneBook.containsKey(query)) {
                System.out.println(query +"="+ phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
    }

}
