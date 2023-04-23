import java.util.*;
public class q10{
    public static void main(String[] args) {
        int ar[]={-2,3,-4,5,2,-2,0};
        Arrays.sort(ar);
          for(int i=0;i<ar.length;i++){
            if(ar[i]>=0){
                System.out.print(ar[i]+ " ");
            }
          }
    }
}