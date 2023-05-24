public class selectsort {

    public static void selsort(int ar[]) {
        for(int i=0;i<ar.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[minpos]>ar[j]){
                    minpos=j;
                }
            }
            int temp=ar[minpos];
            ar[minpos]=ar[i];
            ar[i]=temp;
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int ar[]={5,4,1,3,2};
        selsort(ar);
    }
    
}
