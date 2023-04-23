public interface freq {
    public static void main(String[] args) {
        int at[]={30,20,10};
        int sum=0;
        for(int i=1;i<at.length;i++){
            if (at[i]>at[i-1]){
              sum=sum+(at[i]-at[i-1]);
            }
            
            }
            if(sum<0){
                System.out.println("no");
            }
           
        System.out.println(sum);
    }
}
