import java.util.Stack;

public class stange {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> st=new Stack<>();
        int n= arr.length;
        int ar[]=new int[arr.length];
        for(int i=n-1;i>=0;i--){
           while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
            st.pop();
           }

            if(st.isEmpty()){
                ar[i]=-1;
                }
            else{
                    ar[i]=arr[st.peek()];
                }
            
                st.push(i);
            
        }
        for(int i=0;i<ar.length;i++){
         System.out.print(ar[i]+ " ");
        }
    }
}
