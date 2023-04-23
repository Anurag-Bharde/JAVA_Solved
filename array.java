// import java.util.*;
// public class array {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int marks[]=new int[100];
//         marks[0]=sc.nextInt();
//         marks[1]=sc.nextInt();
//         marks[2]=sc.nextInt();
//         System.out.println("mark 0=" + marks[0]);
//         System.out.println("mark 2=" + marks[2]);
//         System.out.println("mark 1=" + marks.length);
//         sc.close();
//     }
// }

// import java.util.*;

// public class array{
//     public static void main(String[] args) {
//         int ar[];
//      Scanner sc=new Scanner(System.in);
//            int t=sc.nextInt();
//         for (int i = 0; i < ar[p]; i++) {
            
//         }

//         for (int i = 0; i < ar.length; i++) {
            
//             System.out.print(ar[i] + " ");
//         }
//         System.out.println();

//     }
// }

// import java.util.*;

// public class array{

//     public static int ok(String a[] , String n){
       
//         if (){
//             return i;
//         }
//        return -1;
//     }
//     public static void main(String args[]){
//         String menu[]={"samosa","kachori","dahi"};
//         Scanner sc= new Scanner(System.in);
//         String n= sc.next();

//         String x= ok(menu, n);
//         if(x==-1){
//             System.out.println("Not");
//         }
//         else{
//             System.out.println("present "+ x);
//         }
//     }
// }


// import java.util.*;
// public class array{

//     public static void update(int ar[],int c){
//         c=5;
//            for(int i =0;i<ar.length;i++){
//             ar[i]=ar[i]+1;
//            }
//     }
//     public static void main(String args[]){
//         int ar[]={23,54,6};
//         int c=100;

//         update(ar,c);
//         System.out.println(c);

//         for(int i=0;i<ar.length;i++){
//             System.out.println(ar[i]);
//         }
//     }
// }

//konse index pr hai
// import java.util.*;
// public class array{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n= sc.nextInt();
//         int ar[]={12,4,6,7,3,32,3};
//         for(int i=0;i<ar.length;i++){
//             if (ar[i]==n){
// System.out.println("yaha pr hai = "+i);
//             }
//         }
//     }
// }

//largest of array
import java.util.*;

// import javax.xml.transform.Source;
public class array{
    public static void main(String[] args) {
       int ar[]={4,5,7,8,9,-1,-2,5,23};
        // int max= ar[0];
        // int k;
        // for(int i=1;i<ar.length;i++){
        //     if (ar[i]>max){
        //         max = i;
        //     }
        // }
        // System.out.println(max);
                  Arrays.sort(ar);
                  for(int i=0;i<ar.length;i++){
        System.out.print(ar[i]+" ");
                  }
    }
}