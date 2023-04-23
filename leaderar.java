public class leaderar {
    public static void main(String[] args) {
        int ar[]={1,2,3,10,5,6,2};
        int ldr=ar[ar.length-1];
        System.out.print(ldr);
        for(int i=ar.length-2;i>=0;i--){
               if(ldr<ar[i]){
                ldr=ar[i];
                System.out.print(ldr);
               }
        }
    }
    
}
