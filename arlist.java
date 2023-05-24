import java.util.*;
public class arlist {
//     public static void main(String[] args) {
//      Collection values= new ArrayList<>();
//      values.add(9); 
//      values.add("oks");

//      System.out.println(values);

//      Collection<Integer> jk=new ArrayList<>();
//      jk.add(7);
//      jk.add(5);
// System.out.println(jk);
     
     
public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
    
    int i1=1,i2=3,temp=0;
    temp= list.get(1);
    list.set(i1,list.get(3));
    list.set(i2,temp);
    System.out.println(list);

}
}
