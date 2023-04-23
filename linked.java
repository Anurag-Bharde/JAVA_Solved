// class Node{
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
//     }
//     class ok{
//         public static void main(String args[]) {
//             Node head=new Node(10);
//             Node temp1=new Node(20);
//             Node temp2=new Node(30);
//             head.next=temp1;
//             head.next=temp2;
//         }
//     }

// class Node{
   
//     public static Node head;
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }
// class test{
//     public static void main(String[] args) {
//         Node.head=new Node(10);
//         head.next=new Node(20);
//         head.next.next=new Node(20);
//         head.next.next.next=new Node(20);
// printl(10);
//     }

//     public static void printl(Node head) {
//         Node curr=head;
//         while(curr!=null){
//             System.out.println(curr.data+" ");
//             curr=curr.next;
//         }
//     }
// }

// ____________________________________________________________________-

public class linked{
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
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
}

public void addlast(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
    tail.next=newNode;
    tail=newNode;
}

public static void printi(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println("->null");
}

public static int remf(){
    if(size==0){
        System.out.println("ll is empty");
    }
    else if(size==1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
    }
    int val=head.data;
    head=head.next;
    size--; 
    return val;
}

public void add(int idx,int data){
    if(idx==0){
        addfirst(data);
        return;
    }
    size++;
    Node newNode=new Node(data);
    Node temp=head;
    int i=0;
    while(i<idx-1){
        temp=temp.next;
        i++;
    }
    newNode.next=temp.next;
    temp.next=newNode;
}


public static boolean cyc(){
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
         slow=slow.next;
         fast=fast.next.next;
         if(slow==fast){
            return true;
         }
    }
    return false;

}

public static void iscycle(){
    Node slow=head;
    Node fast=head;
    boolean cycle=false;
    while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast){
            cycle=true;
              break;
           }
    }
    if(cycle=false){
        System.out.println("No cycle");
        return;
    }
     slow=head;
     Node prev=null;
     while(slow!=fast){
        prev=fast;
        slow=slow.next;
        fast=fast.next;
     }
     prev.next=null;
}

// public static int rem(int x,Node head){
//     //  Node temp=new Node(head);

// }
public static void main(String[] args) {
    linked ll=new linked();
    ll.addfirst(2);
    // ll.addfirst(1);
    // ll.addlast(3);
    // ll.addlast(4);
    // ll.add(2,8);
    // tail=head.next;
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next= new Node(3);
        head.next.next.next= new Node(4);
        // head.next.next.next= temp;


    System.out.println(cyc());
    // iscycle();
    // System.out.println(cyc());

     
      printi();
    //   System.out.println(ll.size);
    //   remf();
    //   printi();
}
}