// import java.util.*;
// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         for(int i=1;i<=m;i++){
//             for(int j=1;j<=n;j++){
//                 if(j==1 || j==m){
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


//hollow rect
// import java.util.*;
// public class pattern{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         int mt=sc.nextInt();
//         int nt= sc.nextInt();
        
//         for (int i = 1; i <=nt; i++) {
//             if(i==1 || i==nt){
//                 for (int j=1;j<=mt;j++){
//                     System.out.print("*");
//                 }
//             }
//             else{
//                 for(int k=1;k<=mt;k++){
//                     if(k==1 || k==mt){
//                         System.out.print("*");
//                     }
//                     else System.out.print(" ");
//                 }
//             }
            
//             System.out.println();
//         }
//     }
// }


//inverted tri
import java.util.*;
public class pattern{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
            System.out.print("*");
           }
           System.out.println();
        }
    }
}