import java.util.*;
public class heighttow {
    public static void main(String[] args) {
        int ar[]={1,2,3,3,4,5,6};
       int ar2[]={3,3,5};
       ArrayList<Integer> t=new ArrayList<>();
       int i=0;
       int j=0;
       int k=0;
       while(i<ar.length && i<ar2.length){
        if (ar[k]<ar2[j]){
        k++;
        }
       else if (ar[k]>ar2[j]){
        j++;
        }
       else{
           t.add(ar[j]);
           j++;
           k++;
       }
       i++;
       }
       System.out.println(t);
    }
}
