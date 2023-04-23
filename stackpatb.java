import java.util.Stack;

public class stackpatb {
    public static void stac(Stack<Integer> st,int data) {
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int t=st.pop();
        stac(st,data);
        st.push(t);
    }
    public static void rev(Stack<Integer> st){
       if(st.isEmpty()){
        return;
       }
        int t=st.pop();
        rev(st);
        stac(st,t);
        
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        rev(st);
        System.out.println(st);
        // while(!st.isEmpty()){
        // System.out.println(st.pop());
        // }
    }
}
