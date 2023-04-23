public class Stringbuil {
    public static String mergeAlternately(String word1, String word2) {
        int i=0;
        int n=Math.max(word1.length(),word2.length());
       
        StringBuilder td=new StringBuilder("");
        while (i<n){
            if(i<word1.length()){
             td.append(word1.charAt(i));
            }
         
         if(i<word2.length()){
             td.append(word2.charAt(i));
         }
          i++;
        }
        String sv=td.toString(); 
        return sv;
    }
    public static void main(String[] args) {
        String word1="atnt";
        String word2="wal";
        System.out.println(mergeAlternately(word1,word2));
    }
    
}
