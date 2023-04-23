import java.util.Stack;

public class strrev {
    private void insertBottom(Stack<String> stack, String value) {
        if (stack.isEmpty()) {
            stack.add(value);
        } else {
            String top = stack.pop();
            insertBottom(stack, value);
            stack.add(top);
        }
    }
    private void rev(Stack<String> stack) {
        if (stack.isEmpty()) {
            return;
        }
        String top = stack.pop();
        rev(stack);
        insertBottom(stack, top);
    }
    
    public static void main(String[] args) {
        String str="i.like.this.program.very.much";
        Stack<String> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        String tp="";
        for(int i=0;i<str.length();i++){
               if(str.charAt(i)=='.'){
              st.push(tp);

              st.push(".");
              sb.setLength(0);
               }
               else{
                sb.append(str.charAt(i));
                tp=sb.toString();
               }
            }
               st.push(tp);
        System.out.println(st);

        System.out.println("REVERSE:");
          StringBuilder td=new StringBuilder();
          int r=st.size();
         for(int i=0;i<r;i++){
          td.append(st.pop());
         }
         String las=td.toString();
         System.out.println(las);
    }
}
