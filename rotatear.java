public class rotatear {
  public static void main(String[] args) {
    //rotate left by 1
    // int ar[]={1,2,3,4,5};
    // int p[]=new int[ar.length];
    // int temp=ar[ar.length-1];
    // p[p.length]=ar[0];
    // for(int i=ar.length-2;i>=0;i--){
    //     p[i]=temp;
    //     temp=ar[i];

    // }
    // for (int i = 0; i < ar.length; i++) {
    //     System.out.println(p[i]);
    // }
    //__________________________________________

    //rotate to left by k

//     int ar[]={1,2,3,4,5,6,7};
//     int p[]=new int[ar.length];
//     int k=3;
//     for(int i=k;i<ar.length;i++){
//         p[i-k]=ar[i];
//     }
//     int count=0;
// for(int l=(ar.length-k);l<ar.length;l++){
// p[l]=ar[count];
// count++;
// }

//     for(int j=0;j<ar.length;j++){
//         System.out.print(p[j]+" ");
//     }

//rotate right

   int ar[]={1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};  
   revz(ar);
  } 
//   public static void rot(int nums[],int k){
//     int p[]=new int[nums.length];
//    for(int i=k;i<nums.length;i++){
//      p[i-k]=nums[i];
//      p[i]=nums[i-k];
//    }
//    for(int j=0;j<nums.length;j++){
//        System.out.print(p[j]);
//    }


     public static void revz(int ar[]){
           for(int i=0;i<ar.length;i++){
            if(ar[i]==0){
                int temp=ar[i];
                rev(ar,i,ar.length);
                ar[ar.length-1]=temp;
            }
           }
     }
     static void rev(int ar[],int s,int e){
        while(s<=e){
        int x=ar[s];
        ar[s]=ar[e];
        ar[e]=x;
        s++;
        e--;
        }
     }
  }   

