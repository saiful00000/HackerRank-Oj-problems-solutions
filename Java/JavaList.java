package Java;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int value = in.nextInt();
            list.add(value);
        }

        int query = in.nextInt();
        for (int i = 0; i < query; i++) {
            String s = in.next();
            if (s == "insert") {
                int index = in.nextInt();
                int value = in.nextInt();
                list.add(index, value);
            } else {
                int index = in.nextInt();
                list.remove(index);
            }
        }

        for (int value:list) {
            System.out.print(value +" ");
        }
    }

}
