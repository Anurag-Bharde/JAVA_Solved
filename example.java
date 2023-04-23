public class example {
    public static void main(String[] args) {
        int ar[]={12, 35, 1, 10, 34, 1};
        int max=ar[0];
        // int t=0;
        for(int i=1;i<ar.length;i++){
            if(max<ar[i]){
            max=ar[i];
           }
        }
        System.out.println(max);
    }
}
