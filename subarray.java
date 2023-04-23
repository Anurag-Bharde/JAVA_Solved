public class subarray {
    public static void main(String[] args) {
        int ar[]={1,4,3,20,10,5};
        int n=ar.length;
        int sum=2;
        int cur=0;
        int s=0;
        for(int i=0;i<ar.length;i++){
            while(cur>sum && s<n-1){
               cur=cur-ar[i];
               s++;
            }
            if(cur==sum){
                System.out.println("true");
            }
            if(i<n){
                    cur=cur+ar[i];
            }
        }
        System.out.println("false");
    }
    
}
