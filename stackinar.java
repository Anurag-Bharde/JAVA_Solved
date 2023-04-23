// import java.util.ArrayList;

// import java.util.ArrayList;
// public class stackinar {
// static class stack{
//    static   ArrayList<Integer> list=new ArrayList<>();
//    public static boolean isclear(){
//     if(list.size()==0){
//         return true;
//     }
//     return false;
//    }
//     public static void push(int data){
//         list.add(data);
//         System.out.println(list);
//     }
//     public static void pop(){
//         list.remove(list.size()-1);
//     }
//     public static int peek(){
//        return list.get(list.size()-1);
//     }

// }
//     public static void main(String[] args) {
//         stack s=new stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while(!s.isclear()){
//                System.out.println(s.peek());
//                s.pop();
//         }
//     }
    
// }

//_____________________________________________________LL_____________
// import java.util.*;
// public class stackinar{
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     static class stack{
//    static Node head=null;
//         public static Boolean isEmpty(){
//             if(head==null) 
//             return true;
//             return false;
//         }
//         public static void push(int data){
//             Node newnode=new Node(data);
//             if(head==null){
//                 head=newnode;
//             }
//             newnode.next=head;
//             head=newnode;
//             System.out.println(head.data);
//       }
//       public static int pop(int data){
//         if(isEmpty()==true){
//             return -1;
//         }
//         Node temp=head;
//         head=head.next;
//         return temp.data;        
//       }
//       public static int peek(){
//         if(isEmpty()==true){
//             return -1;
//         }
//         return head.data;
//       }
    
//  }
//     public static void main(String[] args) {
//         Stack<Integer> list=new Stack<>();
//         list.push(10);
//         list.push(20);
//         list.push(30);
//         while(!list.isEmpty()) {
//             System.out.println(list.peek());
//             list.pop();
//         }
        
//     }

//  public static void main(String[] args) {
    //     Stack<Integer> st=new Stack<>();
    //      st.push(1);
    //      st.push(2);
    //      st.push(3);
//      System.out.println(st);
//      inserttop(st,5);
//      while(!st.isEmpty()){
//            System.out.println(st.pop());
//      }
//  }

// }
import java.util.*;
public class stackinar{
    // public static void main(String[] args) {
        //     Stack<String> st=new Stack<>();
        //     String s="Anurag";
        //     for(int i=0;i<s.length();i++){
            //        st.add(s.substring(i, i+1));
            //     }
            //   while(!st.isEmpty()){
                //     System.out.print(st.pop());
                //   }
                // }
                //____________________________________________________________
     public static void inserttop(Stack<Integer> st,int data){
         if(st.isEmpty()){
             st.push(data);
             return;
         }
         int top=st.pop();
         inserttop(st,data);
         st.push(top);
     }
                
      public static void rev(Stack<Integer> st){
          if(st.isEmpty()){
            return;
          }
          int top=st.pop();
          rev(st);
          inserttop(st, top);
      }
   public static void main(String[] args) {
    Stack<Integer> st=new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    rev(st);
    while(!st.isEmpty()){
        System.out.println(st.pop());
    }
}
}