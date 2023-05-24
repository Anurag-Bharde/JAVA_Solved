// import java.util.*;
// public class ar2d {

//     public static boolean print(int ar[][], int key){
//         for(int i=0;i<ar.length;i++){
//             for(int j=0;j<ar[0].length;j++){
//                 if (ar[i][j]==key){
//                     System.out.println("found at "+"("+i+","+j+")");
//                    return true;
//                 }
//             }
//         }
//         System.out.println("not found");
//         return false;
//     }
//     public static void main(String[] args) {
//         int matrix[][]=new int[3][3];
//         int n=matrix.length, m=matrix[0].length;

//         Scanner sc=new Scanner(System.in);
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }

//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(matrix[i][j]);
//             }
//             System.out.println();
//         }
//         int t=sc.nextInt();
//         System.out.println(print(matrix,t));
        
//     }
    
// }
//_____________________________________________________________________________________-

import java.util.*;
public class ar2d {

    public static int print(int ar[][]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                if (ar[i][j]>max){
                    max=ar[i][j];
                }
            }
        }
        
        return max;
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=matrix.length, m=matrix[0].length;

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Max is "+print(matrix));
        
        sc.close();
    }
    
}