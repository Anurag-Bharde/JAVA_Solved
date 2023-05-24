public class maxsubar {

    //brute force
    // public static void maxsubr(int ar[]){
    //     int curr=0;
    //     int max=0;

    //     for(int i=0;i<ar.length;i++){
    //         for(int j=i;j<ar.length;j++){
    //             curr=0;
    //             for(int k=i;k<=j;k++){
    //                     curr += ar[k];
    //                    }
    //                    System.out.println(curr);
    //                    if(max<curr){
    //                     max=curr;
    //                    }
    //         }
    //     }
    //     System.out.println("max = "+max);
    // }
//_________________________________________________________________________________________

//PREFIX ARRAY
    //   public static void maxsubr(int ar[]){
    //     int curr=0;
    //     int max=0;
    //     int prefix[]= new int[ar.length];

    //     prefix[0]=ar[0];
    //     for(int i=1;i<prefix.length;i++){
    //         prefix[i]=prefix[i-1]+ar[i];
    //     }
    //     for (int i = 0; i < ar.length; i++) {
    //         for(int j=i;j<ar.length;j++){
    //             curr = i==0 ? prefix[j]:prefix[j]-prefix[i-1];
    //             if (max<curr){
    //                 max=curr;
    //             }
    //         }
            
    //     }
    //     System.out.println(max);
    //     }
 //______________________________________________________________________________________
 
 //kadanes algo
//  public static void maxsubr(int ar[]){
//     int ms = Integer.MIN_VALUE;
//     int cs=0;

//     for (int i=0;i<ar.length;i++){
//         cs=cs+ar[i];
//         if (cs<0){
//             cs=0;
//         }
//         ms=Math.max(cs,ms);
//     }
//     System.out.println(ms);
//  }

//leetcode 974
// public static int maxsubr(int ar[],int k){
//     int curr=0;
//     int sum=0;
//     int count=0;
//     int prefix[]= new int[ar.length];

//     prefix[0]=ar[0];
//     for(int i=1;i<prefix.length;i++){
//         prefix[i]=prefix[i-1]+ar[i];
//     }
//     for (int i = 0; i < ar.length; i++) {
//         sum=0;
//         for(int j=i;j<ar.length;j++){
//             curr = i==0 ? prefix[j]:prefix[j]-prefix[i-1];
//             sum =sum+curr;
//             if(curr%k==0){
//                 count++;
//             }
//         }
//      }
//     return count;
// }

//leetcode
public static int maxsubr(int ar[],int k){
    int ms = Integer.MIN_VALUE;
    int cs=0;

    for (int i=0;i<ar.length;i++){
        cs=cs+ar[i];
        if (cs<0){
            cs=0;
        }
        ms=Math.max(cs,ms);
    }
    System.out.println(ms);
    return ms;
 }


    public static void main(String[] args) {
        int ar[]={4,5,0,-2,-3,1};
        int k=5;
       
        System.out.println(maxsubr(ar,k));
    }
    
}
