public class MaxJump{
    public static void jump(int ar[]){
        int n=ar.length;
        int i=0;
        int ct=0;
        while(i<n-1){
            i+=ar[i];
            ct++;
        }
    System.out.println(ct);
    }
    public static void main(String[] args) {
        int ar[]={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        jump(ar);
    }
}