// public class Consiq1 {
//     public static void main(String[] args) {
//         int ar[]={1,0,1,1,1,1,1,0,1,1,1,1,1,1,0};
//         int i=0;
//         int max=0;
//         int count=0;
//         while(i<ar.length){
//             if(ar[i]==1){
//                 count++;
//                 max=Math.max(max,count);
//             }
//             else{
//                 count=0;
//             }
//             i++;
//         }
//         System.out.println(max);
//     }
    
// }

public class Consiq1{
    public static void main(String[] args) {
        int ar[]={10,12,14,7,8};
           int i=0;
           int j=1;
          int n=ar.length;
          int max=0;
          int count=0;
           while(j<n ||i<n){
             if(ar[i]%2==0 &&ar[j]%2!=0){
                count++;
                max=Math.max(max,count);
             }
             else{
                count=0;
             }
             i+=2;
                j+=2;
             
           }
           System.out.println(max);

    }
}