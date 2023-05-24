import java.util.*;
public class container {
    public static void main(String[] args) {
        ArrayList<Integer> buck=new ArrayList<>();
        buck.add(1);
        buck.add(8);
        buck.add(6);
        buck.add(2);
        buck.add(5);
        buck.add(4);
        buck.add(8);
        buck.add(3);
        buck.add(7);
        
        int s=0,t=0,max=Integer.MIN_VALUE,count=1;

        // for(int i=0;i<buck.size();i++){
            int i=0;
            count=0;
            t=0;s=buck.get(i);
            for(int j=i+1;j<buck.size();j++){

                s= Math.min(s,buck.get(j));
                  count=count+1;
                
                // if(buck.get(i)>buck.get(j)){
                // t=s+t+buck.get(j);
                // }
                // else
                // t=s+t;
            }
            t=count*s;
            if(t>max){
                max=t;
            }
        // }
        System.out.println(t);
    }
}
