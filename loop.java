// import java.nio.channels.SocketChannel;
// import java.util.Scanner;

// public class loop {
//     public static void main(String[] args) {
//         for(int i=0;i<6;i+=2){
//             System.out.println(i);
//         }
//     }
// }


// public class loop {
//     public static void main(String[] args) {
//     for (int i = 0; i < 6; i++) {

//         System.out.println(i);
//     }
        
//     }
// }

// import java.util.*;

// public class loop{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         int count=1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//             System.out.print("*");
//             }
//         System.out.println("\n");    
//         }

//     }
// }


// import java.util.*;

// public class loop{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int g=sc.nextInt();
//         int n=0,cut=0,even=0,odd=0;
//       int i=1;
//       while(i<g) {
//        n=g%10;
//       cut=cut+n;
//       g=g/10;
//        if (n%2==0){
//         even+=n;
//        }
//        else{
//         odd+=n;
//        }
//        n/=10;
//       }
//       System.out.println(even);
//       System.out.println(odd);
// i++;
//     }
//     System.out.println(cut);
// }
// }


//right hand tri
// import java.util.*;
// public class loop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for (int i = 1; i < n; i++) {
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//         }
//     }
// }

//inverted tri
public class loop{
    public static void main(String[] args) {
        int a=5;
        for (int i = 1; i<=a; i++) {
            for (int j=a;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}