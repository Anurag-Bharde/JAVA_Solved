public class recursion {
    // public static void rec(int n){
    //     if(n==1){
    //         System.out.println(n);
    //         return;
    //     }
    //     System.out.println(n);
    //     rec(n-1);
        

    // }

    //factorial
    // public static int rec(int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     int fnm=rec(n-1);
    //     int fm=n*fnm;
    //     return fm;
    // }

//sum of n nos
    //  public static int rec(int n){
    //     if (n==1){
    //         return 1;
    //     }
    //     int sum= n+(rec(n-1));
    //     return sum;
    //  }

    //sibbonaci
    // public static int rec(int n){
    //     if(n==0 || n==1){
    //         return n;
    //     }
    //     int f1=rec(n-1);
    //     int f2=rec(n-2);
    //     int fib= f1+f2;
    //     return fib;
    // }

//chceck if sorted

// public static boolean rec(int ar[],int i){
//     if(i==ar.length-1){
//         return true;
//     }
//     if(ar[i]>ar[i+1]){
//         return false;
//     }
//     return rec(ar,i+1);    
// }


// public static boolean isSorted(int[] array) {
//     for (int i = 0; i < array.length - 1; i++) {
//         if (array[i] > array[i + 1]) {
//             return false;
//         }
//     }
//     return true;
// }

// public static int searc(int ar[],int key,int i){
//     if(i==ar.length){
//         return-1;
//     }
//     if(ar[i]==key){
//         return i;
//     }
//     return searc(ar,key,i+1);
// }

// public static int power(int a,int n){
// //    { if(a==0)return 1;

// //     int fn=a*power(a,n-1);
// //    return fn; }
 
//       if(n==0){

//       return 1;
//       }
//           int half= power(a,n/2);
//           int ht=half * half;

//           if(n%2!=0){
//              ht=a*ht;
//           }
//           return ht;
// }


//duplicate string

public static int pair(int n){
    if(n==1 || n==2){
        return n;
    }

    int fn1= pair(n-1);

    int f2=pair(n-2);
    int pai= f2*(n-1);

    return fn1+pai;
}


     


    public static void main(String[] args) {
        // int n[]={1,2,3,4,5,4};
        int k=3;
        // int x=5;

       System.out.println(pair(k));
    }
}
