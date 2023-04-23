import java.util.*;
public class arraylist{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> main=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        main.add(list);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(5);
        list2.add(5);
        main.add(list2);

        for(int i=0;i<main.size();i++){
          ArrayList<Integer> cur=main.get(i);
          for(int j=0;j<cur.size();j++){
            System.out.print(cur.get(j)+" ");
          }
          System.out.println();
        }
        sc.close();
    }
}