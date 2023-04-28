import java.util.Stack;

public class validpar{
    public static boolean valid(String st){
        int n=st.length();
        int d=0;
        int tot=0;
        Stack<Character> td=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.charAt(i)=='(' || st.charAt(i)=='{' ||st.charAt(i)=='['){
                d++;
                 td.push(st.charAt(i));
                 tot=Math.max(d,tot);
            }
            else if(td.peek()=='('&& st.charAt(i)==')' || td.peek()=='['&& st.charAt(i)==']'||td.peek()=='{'&& st.charAt(i)=='}'){
                     td.pop();
                     d--;
            }
            else return false;
        }
        System.out.println(d);
        if(td.isEmpty()) return true;
        return false;
    }
    public static void main(String[] args) {
        String st="(1)+((2))+(((3)))";
        System.out.println(valid(st));

    }
}