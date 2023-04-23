// import java.util.*;
public class insertcc {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public static Node insert(Node head,int x){
        Node temp=new Node(x);
        if(head==null){
            temp.next=temp;
        }
        else{
            Node curr=head;
            while(curr.next!=head){
                curr=curr.next;
                curr.next=temp;
                temp.next=head;
            }
        }
        return temp;
    }


    public static void print(){
        Node t=head;
        while(t!=null){
            System.out.println(t.data);
            t=t.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // LinkedList<Integer> a=new LinkedList<>();
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head;

     insert(head, 23);
     print();
        
    }
    
}
