public class rot{
    public static void main(String[] args) {
        int ar[]={1,2,4,5,6,7};
        int n=3;
        int t=0;
        for(int i=n;i<ar.length;i++){
           ar[i]=(n-1)%n;
        }
        for(int i=0;i<ar.length;i++){
           System.out.println(arsta[i]);
        }
    }
}