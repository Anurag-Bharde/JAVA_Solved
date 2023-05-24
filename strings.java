public class strings {
    public static void main(String[] args) {
        // String fruits[]={"apple","Mango","Banana","Watermellon"};
        // String largest=fruits[0];
        // for(int i=1;i<fruits.length;i++){
        //        if(largest.compareToIgnoreCase(fruits[i])<0){
        //         largest=fruits[i];
        //        }
        // }
        // System.out.println(largest);
        // commentout__________________________________
        // String sr="Helooworldl";
        // sr="jaksdfj";
        // System.out.println(sr);
     //___________________________________--
     StringBuilder sb=new StringBuilder("");
     for(char i='a';i<='z';i++){
        sb.append(i);
     }
     System.out.println(sb.length());
     
    }
}
