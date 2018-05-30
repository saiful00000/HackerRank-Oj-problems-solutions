package Practice;

public class DeletElementFromArray {
    public static void main(String[] args){
        int[] a = {1,2,3,3,4,3,3};
        int valueToBeDelet = 3;
        int len = a.length;
        for(int i=0; i<len; i++){
            if(a[i] == valueToBeDelet){
                for(int j=i; j<len-1; j++){
                    a[j] = a[j+1];
                }
                len--;
               i--;
            }
        }
        for(int i=0; i<len; i++){
            System.out.print(a[i] +" ");
        }
        System.out.println();
    }
}
