public class trapwater {

    public static int trw(int ar[]){
        //left max
        int leftmax[]= new int [ar.length];
        leftmax[0]=ar[0];
        for(int i=1;i<ar.length;i++){
            leftmax[i]=Math.max(ar[i],leftmax[i-1]);
        }
        //right max
        int rightmax[]= new int[ar.length];
        rightmax[ar.length-1]=ar[ar.length-1];
        for(int i=ar.length-2;i>=0;i--){
            rightmax[i]=Math.max(ar[i],rightmax[i+1]);
        }
         int trappedwater=0;
        //loop
        for(int i=0;i<ar.length;i++){
            int waterlevel=Math.min(rightmax[i],leftmax[i]);
             trappedwater+=waterlevel-ar[i];
        }
        return trappedwater;


    }
    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int x=trw(height);
        System.out.println(x);
    }
    
}
