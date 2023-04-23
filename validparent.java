import java.util.*;
public class validparent {

    public static boolean valid(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);

            if(a=='('||a=='{'||a=='['){
                st.push(a);
            }
            else if(st.isEmpty()) return false;
            else{
                if(st.peek()=='('&& a==')' || st.peek()=='['&& a==']'||st.peek()=='{'&& a=='}'){
                    st.pop();
                }
                else return false;
            }
        }
        if(st.isEmpty()) return true;
        else return false;
    }

    public static boolean isdupli(String str){
        Stack<Character> tr=new Stack<>();
         for(int i=0;i<str.length();i++){
             int count=0;
            if(str.charAt(i)==')'){
                while(tr.peek()!='('){
            tr.pop();
            count++;
                }
                if(count<1) return true;
                else tr.pop();

            }
            else tr.push(str.charAt(i));

         }
         return false;
    }
    public static void main(String[] args) {
        String str="(ab)";
        System.out.println(valid(str));
    }
}
