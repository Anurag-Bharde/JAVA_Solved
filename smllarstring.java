public class smllarstring {
    public static String getSmallestAndLargest(String s, int k) {
        int n=s.length();
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
    
        for(int i=0;i<n-k+1;i++){
            String r=s.substring(i,i+k);
            // System.out.println(r);
            if(r.compareTo(smallest)<0){
                smallest=r;
                
                // System.out.println(smallest);
            }
            if(r.compareTo(largest)>0){
                largest=r;
                // System.out.println(s4);
            }
            
        }
        return smallest + "\n" + largest;
    }

    public static void main(String args[]){
        String s="Welcometojava";
        int k=3;
       System.out.println(getSmallestAndLargest(s, k));
    }
}
