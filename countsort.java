public class countsort {

    public static void count(int ar[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            large=Math.max(large,ar[i]);
        }
        int count[]=new int[large+1];
        for(int i=0;i<ar.length;i++){
            count [ar[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                ar[j]=i;
                j++;
                count[i]--;
            }
        }
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
        }
    public static void main(String[] args) {
        int ar[]={1,4,1,3,2,4,2,7};
        count(ar);
    }
    
}
