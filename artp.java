//adding 2 array
//merge 2 sorted arry without extra space
// public class artp{
//     public static void main(String[] args) {
//         int ar[]={1,35};
//         int ar2[]={6 ,9, 13, 15, 20, 25, 29, 46};
//         int k;
//         for(int i=0;i<ar.length;i++){
//             if(ar[i]>ar2[0]){
//                 int temp=ar[i];
//                 ar[i]=ar2[0];
//                 ar2[0]=temp;
//             }
//             int fir=ar2[0];
//             for( k=1;k<ar2.length && ar2[k]<fir;k++){
//                  ar2[k-1]=ar2[k];
//             }
//             ar2[k-1]=fir;
//         }
//         for(int m=0;m<ar.length;m++){
//             System.out.print(ar[m]);
//         }
//         System.out.println();
//         for(int l=0;l<ar2.length;l++){
//             System.out.print(ar2[l]);
//         }
//     }
// }

//using gap sort
public class artp{
     public static void swap(int a,int b){
        int temp =a;
        a=b;
        b=temp; 
     }
    public static void merge(int ar[],int ar2[]){
        int n=ar.length;
        int m=ar2.length;
        int gap=(int) Math.ceil((double)(n+m)/2.0);
        while(gap>0){
            int i=0;
            int j=gap;
            while(j<(n+m)){
                if(j<n && ar[i]>ar[j]){
                    swap(ar[i],ar[j]);
                }
                else if(j>=n && i<n && ar[i]>ar2[j-n]){
                    swap(ar[i],ar2[j-n]);
                }
                else if(j>=n && i>=n && ar2[i-n]>ar2[j-n]){
                    swap(ar2[i-n],ar2[j-n]);
                }
                i++;
                j++;
                if(gap==1){
                    gap=0;
                }
                else{
                    gap=(int) Math.ceil((double)gap/2.0);
                }
            }
        }
        for(int l=0;l<n;l++){
            System.out.println(ar[l]);
        }
        for(int l=0;l<m;l++){
            System.out.println(ar2[l]);
        }
    }
    public static void main(String[] args) {
        int  ar[]={1, 4, 7, 8, 10};
        int ar2[]={2, 3, 9};
        merge(ar,ar2);
        
    }
}