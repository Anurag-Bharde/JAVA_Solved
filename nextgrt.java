import java.util.*;
public class nextgrt{
    public static void main(String[] args) {
        int ar[]={1,3,2,4};
        int ar2[]=new int[ar.length];
        Stack<Integer> st=new Stack<>();
        int i=0;
        int j=1;
        while(j<ar.length){
            if (ar[i]<ar[j]){
            //    ar2[i]=ar[j];
            st.push(ar[j]);
                i++;
                j++;
            }
            else{
                j++;
                if(j>=ar.length-1){
                    // ar2[i]=-1;
                    st.push(-1);
                    i++;
                    j=i+1;
                }
            }
        }
        // ar2[ar.length-1]=-1;
        st.push(-1);
        // for(int k=0;k<ar2.length;k++){
        //      System.out.println(ar2[k]);
        // }
        System.out.println(st);
    }
}