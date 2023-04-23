//max
// public class func {
//     public static void main(String[] args) {
//         int a=1;
//         int b=3;
//         System.out.println(Math.max(a,b));
//     }
// }

// import java.util.*;
// public class func {
//     public static void main(String[] args) {
//         int ans=sum();
//         System.out.println(ans);
        
//     }
    
//     static int sum(){
//         Scanner sc= new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=a+b;
//         sc.close();
//         return c;
//     }
// }


// import java.util.*;
// public class func{
//       public static int prod(int a,int b){
//         int p=a*b;
//         return p;
//       }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int y=sc.nextInt();
//         int x=sc.nextInt();
//         int ans=prod(x,y);
//         System.out.println(ans);
//     }
// }

// import java.util.*;
// public class func{

//   public static int rec(int c){
//     int t=1;
//     for (int i=1;i<=c;i++){
//       t=t*i;
//     }
//     return t;
//   }
//   public static void main(String args[]){
//     Scanner sc= new Scanner(System.in);
//     int t=sc.nextInt();
//     int c= rec(t);
//     System.out.println(c);
//   }
// }


//ncr
// import java.util.*;
// public class func{
//       public static int prod(int a){
//         int i=1,p=1;
        
//         while(i<=a){
//          p=p*i;
//             i++;
//         }
//         return p;
//       }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt();
//         int y=sc.nextInt();
//         int ans1=prod(x);
//         int ans2=prod(y);
//         int z=x-y;
//         int ans3=prod(z);

//         int ans=(ans1)/(ans2*ans3);
//         System.out.println(ans);
//     }
// }

// import java.util.*;

// public class func{

//   public static boolean p(int n){
//     boolean isPrime=true;
//     for(int i=2;i<n;i++){
//         if(n%i==0){
//           isPrime=false;
//         }
//     }
//     return isPrime;
//   }
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();
//     boolean x=p(a);
//     System.out.println(x);
//     sc.close();
//   }
// }

//Prime in given range
// import java.util.*;

// public class func{

//   public static boolean p(int n){
//     boolean isPrime=true;
//     for(int i=2;i<=Math.sqrt(n);i++){
//         if(n%i==0){
//           isPrime=false;
//         }
//     }
//     return isPrime;
//   }

//   public static void range(int n){
//    for (int i = 2; i <=n; i++) {
//     if( p(i)){
//      System.out.print(i+" ");
//     }
//        }
//        System.out.println();
//   }
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();
//     range(a);
//     sc.close();
//   }
// }

// public class func{
//   public static void main(String[] args) {
//     int n=1011;
//     int i=0;
//     int ld,dec=0;
//     while(n!=0){
//        ld=n%10;
//        dec=dec+(ld*((int)Math.pow(2,i)));
//        n/=10;
//        i++;
//     }
//     System.out.println(dec);
//   }
// }

// public class func{
//   public static void main(String[] args ){
//     int n=23;
//     int i=0;
//     int rem=1;
//     int bin=0;
//     while(n!=0){
//       rem=n%2;
//       bin=bin+rem*(int)Math.pow(10,i);
//       n/=2;
//       i++;
//     }
//     System.out.println(bin);
//   }
// }