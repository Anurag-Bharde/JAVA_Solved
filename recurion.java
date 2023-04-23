import java.util.*;
public class recurion {

    public static void rep(String st,int n){
        if(n==1){
            System.out.println(st);
            return;
        }
        System.out.println(st);
        rep(st,n-1);
    }


    public static void prin(int n,int i){
        if(n<i){
            // System.out.println(n);
            return;
        }
        prin(n,i+1);
        System.out.println(i);
    }

    
    public static int sum(int n) {
        if(n==0){
            return 0;
        }
        int s=n + (sum(n-1));
        return s;
    }



    // public static void rivar(int ar[], int n,int i){
    //     if(i>(n/2)){
    //         return ;
    //     }
    //     Collections.swap(ar[],ar[i],ar[n-i-1]);;

    // }
    // public static void main(String[] args) {
    //     String str="ANURAG";
    //     int ar[]={1,2,3,4,2};
    //     int n=ar.length;
    //     System.out.println(rivar(ar,n,0));
    // }
    
}
