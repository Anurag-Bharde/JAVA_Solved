public class bubsort {

    public static void bub(int ar[]){
        for (int i=0;i<ar.length-1;i++){
            for(int j=0;j<ar.length-i-1;j++){
                if(ar[j]>ar[j+1]){
                int temp=ar[j];
                ar[j]=ar[j+1];
                ar[j+1]=temp;
                }

            }
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int ar[]={4,3,7,1,5};
        bub(ar);
        // print(ar);
    }
    
}
