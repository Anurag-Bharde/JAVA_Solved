import java.util.*;
public class LList{
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
      public static int size;

      public void addfirst(int data){
        size++;
        Node newNode=new Node(data);
        if(head==null){
        head=tail=newNode;
        return;
        }
        newNode.next=head;
        head= newNode;
        
      }
      public void addLast(int data){
        size++;
        Node newNode=new Node(data);
        if (head==null){
        head=tail=newNode;
        return;
        }
        tail.next=newNode;
        tail=newNode;
      }
      public void addinm(int pos,int data){
        size++;
         Node newnode=new Node(data);
              int p=0;
              Node t=head;
              while(p<pos-1){
                t=t.next;
                p++;
              }
              newnode.next=t.next;
          t.next=newnode;
      }
      public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
      }
      public void removef(){
        if(size==0){
            System.out.println("no data");
            return;
        }
        if(size==1){
            System.out.println(head);
            head=null;
            size--;
            return;
        }
        System.out.println(head.data);
        head=head.next;
        size--;
      }
      // public void searchi(int key){
      //   int pos=0;
      //   Node i=head;
      //   while(i.data!=key || pos<size){
      //     if(i.data==key) System.out.println(pos);
      //     i=i.next;
      //     pos++;
      //   }
      // }
      public void rev(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
          next=curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;
        }
        head=prev;
      }

      public static void main(String args[]){
        
        LList ll=new LList();
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addLast(5);
        ll.addinm(1, 10);
        // ll.print();
        // ll.removef();
        // ll.print();
        // ll.searchi(2);
        ll.rev();
        // ll.print();
        // System.out.println(size);
        
      }
}