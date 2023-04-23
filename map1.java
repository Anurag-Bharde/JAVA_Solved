import java.util.*;
public class map1{
    public static void main(String[] args) {
        Map<String, Integer> ok=new HashMap<>();
        ok.put("one", 1);
        ok.put("Two",2);
        ok.put("Three", 3);
        if(!ok.containsKey("T")){
            ok.put("Five",5);
        }
        ok.putIfAbsent("ok", 20);
        System.out.println(ok);


        // //Iterte
        // for(Map.Entry<String, Integer> e:ok.entrySet()){
        //     // System.out.println(e.getKey());
        //     // System.out.println(e.getValue());
        // }
        for(String Key: ok.keySet()){
            System.out.println(Key);
        }
        System.out.println(ok.containsValue(3));

    }
}