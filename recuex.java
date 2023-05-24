public class recuex {

    // public static int rec(int n){
    //     if(n<2){
    //         return n;
    //     }
    //     int p=rec(n-1);
    //     int q=rec(n-2);
    //     int t=p+q;
    //     return t;
    // }

public static void subset(String str, int i, String st){
           if(i==str.length()){
            System.out.println(st);
            return;
           }

           subset(str,i+1,st+str.charAt(i));
           subset(str, i+1, st);


}

    public static void main(String[] args) {
        // int n=6;
        String str="abc";
        subset(str, 0, "");
    }
}
