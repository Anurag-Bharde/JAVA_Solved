public class LargStr {
    public static void maxOdd(String S){
        int t=Integer.parseInt(S);
        int x=Integer.MIN_VALUE;
        for(int i=0;i<S.length();i++){
            int r=t%10;
            if(r%2!=0){
                x=Math.max(x,r);
            }
             t=t/10;
        }
        System.out.println(x);
    }
    String maxOdd2(String s) {
        // code here
         int n=s.length();
         for(int i=n-1;i>=0;i--){
             if((s.charAt(i)-'0')%2==1){
                 String r=s.substring(0,i+1);
                 return r;
             }
         }
        return "";
    }
    public static void main(String[] args) {
        String S="504";
       Solution obj=new Solution();
       System.out.println(obj.maxOdd2(S));

    }
}
