// import java.util.*;
// public class inp {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//           String inpu = sc.next();
//       System.out.println(inpu+" jaca na chuziye");
//     }
    
// }

// import java.util.*;

// public class inp{
//   public static void main(String args[]){
//     Scanner sc= new Scanner(System.in);
//     String hoe= sc.nextLine();
//     System.out.println(hoe);
//   }
// }

// import java.util.*;
// class inp{
//   public static void main(String args[]){
//     Scanner sc= new Scanner(System.in);
//     int okok= sc.nextInt();
//     System.out.println(okok+"ja ki ra bhadya");

//   }
// }

// import java.util.*;

// public class inp {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
//          while(t-->0){
          
//     }int n=sc.nextInt();
//     int m=sc.nextInt();
//     if((n+m)==2){
//         System.out.println("Alice");
//     }
//     else{
//         boolean isPrime=true;
//         for (int i = 2; i < Math.sqrt(n); i++) {
//             if((n+m)%i==0){
//               isPrime=false;
//             }
            
//         }
//         if(isPrime==true){
//             System.out.println("Alice");
//         }
//         else{
//             System.out.println("BOb");
//         }
//     }
//     sc.close();
//     }
    
// }

// public class inp
// {public static void main(String[]args) {
//     int[][]nums= { {1,4,9},{11,4,3},{2,2,3} };
//     int sum=0;
//     //sum of 2nd row elements
//     for(int j=0;j<nums[0].length;j++) {
//         sum+=nums[1][j];}System.out.println("sum is : "+sum);
//     }}
    

// public class inp{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();
//         int d=sc.nextInt();
//           int x=Math.min(a,b);
//           int y=Math.min(c,d);
//           int z=Math.min(x,y);
//           int r=Math.max(x,y);
//           boolean map[]=new boolean[r];
//           for(int i=x;i<=Math.max(a,b);i++){
//                  map[i]=true;
//           }
//           for(int j=y;j<=Math.max(c,d);j++){
//             map[j]=true;
//           }
//         int count=0;
//           for(int k=z;k<=r;k++){
//             if(map[k]==true){
//                count++;
//             }
//           }
//           System.out.println(count);
//     }
// }

class inp{
  public static void main(String[] args) {
    int ar[]={1,2,3,4,5,6};
    int o=0;
    int j=ar.length-1;
     while(o!=j/2){
      System.out.println(ar[o]);
      System.out.println(ar[j]);
      o++;
      j--;
     }
  }
}