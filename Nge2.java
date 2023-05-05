import java.util.Stack;

public class Nge2{

    public static void nge(int arr[]){
        Stack<Integer> st=new Stack<>();
        int n= arr.length;
        int max=Integer.MIN_VALUE,p=0;
        int ar[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
          if(max<arr[i]){
            max=arr[i];
            p=i;
            // ar[p]=max;
          }
          ar[i]=max;
        }
        System.out.println(max);
        for(int i=p;i>=0;i--){
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
    public static void main(String[] args) {
        int arr[]={1, 4, 5, 2, 8, 7};
        nge(arr);
    }
}