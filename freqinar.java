public class freqinar {
    public static void main(String[] args) {
        int ar[]={10,10,10,25,30,30};
        // int i=0;
        // int j=0;
        // int count=0;
        // // int n=ar.length;
        // while(j<6){
        //         if(ar[i]==ar[j]){
        //            count++;
        //             j++;
        //         }
        //         else{
        //             System.out.println(ar[i]+"="+count);
        //             i=j;
        //             count=0;
        //         }
        //         // if(ar[j]==n-1){
        //         //     System.out.println(ar[j]+"="+count);
        //         // }
                
        // }

        //_______________________

        int freq=1;
        int i=1;
        while(i<ar.length){
            while(i<ar.length && ar[i]==ar[i-1]){
                freq++;
                i++;
            }
            System.out.println(ar[i-1]+"="+freq);
            i++;
            freq=1;
        }
        if((ar.length==1)||(ar[ar.length-1]!=ar[ar.length-2])){
            System.out.println(ar[ar.length-1]+"="+1);
        }
    }
    
}
