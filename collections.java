import java.util.*;
public class collections {
    public static void main(String[] args) {
        Set<Integer> se=new HashSet<>();
             se.add(1);
             se.add(21);
             se.add(100);
             se.add(3);
             se.add(41);
             se.add(91);
             System.out.println(se);
        System.out.println(se.contains(9));
        se.remove(91);
        System.out.println(se);
        System.out.println(se.isEmpty());
        System.out.println(se.size());
        se.clear();
        System.out.println(se);
    }
    
}
