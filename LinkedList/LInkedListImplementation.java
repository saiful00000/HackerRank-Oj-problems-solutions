package LinkedList;
import java.util.*;
public class LInkedListImplementation {
    public static void main(String[] args){
        LinkedList <String> list = new LinkedList<String>();

        list.add("b");
        list.add("c");
        list.addLast("z");
        list.addFirst("a");

        System.out.println(list);

        // size of linkedlist
        int size = list.size();
        System.out.println(size);

        // check if a element is or not in the linked list
        boolean check = list.contains("x");
        if(check){
            System.out.println("element is not in the list");
        }
    }
}
