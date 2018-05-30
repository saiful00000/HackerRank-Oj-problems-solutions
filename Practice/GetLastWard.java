package Practice;

public class GetLastWard {
    public static void main(String[] args){
        String str = "a ";

        int index = str.lastIndexOf(' ');
        System.out.println((str.length()-1)-index);

    }
}
