public class movztoe {

    // public static void swap(int a,int b){
    //     int temp=a;
    //     a=b;
    //     b=temp;
    //     System.out.println(a);
    //     System.out.println(b);
    // }
    // public static void zero(int ar[],int n){
    //  int i=0;
    //  int j=0;
     
    //  while(i<n){
    //     if(ar[i]==0){
    //         j=i;
          
    //     }
    //    else if(ar[i]>0 ){
    //         swap(ar[i],ar[j]);
    //         j++;
    //     }
    //     i++;
    //  }
    //      for(int k=0;k<n;k++){
    //         System.out.print(ar[k]+" ");
    //      }
    // }
    // public static void main(String[] args) {
    //     int ar[]={3,5,0,4};
    //     int n=ar.length;
    //     //  zero(ar,n);
    //     int a=2;
    //     int b=3;
    //     swap(a,b);
    //     // System.out.println(a);
    //     // System.out.println(b);
    // }

     //finding first zero occurrence
     public static void main(String[] args) {
        int arr[] ={ 1,2,0,1,0,4,0};
        zerosToEnd(arr);
    
      }
      public static void zerosToEnd(int[] arr) {
    
     int k = 0;
     while (k < arr.length) {
       if (arr[k] == 0) {
 
         break;
       } else {
         k = k + 1;
       }
     }
 
     //finding zeros and immediate non-zero elements and swapping them
     int i = k, j = k + 1;
 
     while (i < arr.length && j < arr.length) {
       if (arr[j] != 0) {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
         i++;
 
       }
 
       j++;
 
     }
     for (i = 0; i < arr.length; i++) {
       System.out.print(arr[i] + " ");
     }
   }
}
