public class maxdif {
    public static void main(String[] args) {
        int ar[]={2,3,10,6,4,8,1};
        int res=ar[1]-ar[0];
        int min=ar[0];
        for(int i=1;i<ar.length;i++){
         res=Math.max(res,ar[i]-min);
         min=Math.min(min,ar[i]);
        }
        System.out.println(res);
    }
    
}
