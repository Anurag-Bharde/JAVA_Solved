public class insert {
    public static void insort(int ar[]){
        for(int i=1;i<ar.length;i++){
            int curr=i;
            int prev=i-1;
            while(prev>=0 && ar[prev]>curr){
                ar[prev+1]=ar[prev];
                prev--;
            }
            ar[prev+1]=curr;
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
public static void main(String[] args) {
    int ar[]={5,4,1,3,2};
    insort(ar);
}    
}
