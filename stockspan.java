import java.util.*;
// public class stockspan {

//        int n = prices.length;
//         int[] spans = new int[n]; // Array to store the spans
//         Stack<Pair> stack = new Stack<>(); // Stack to store pairs (price, index)

//         // Process the first element
//         stack.push(new Pair(prices[0], 0));
//         spans[0] = 1;

//         // Process the rest of the elements
//         for (int i = 1; i < n; i++) {
//             while (!stack.isEmpty() && stack.peek().price <= prices[i]) {
//                 stack.pop();
//             }

//             spans[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek().index);
//             stack.push(new Pair(prices[i], i));
//         }

//     }
//      class Pair{
//         int price;
//         int index;

//         Pair(int price,int index){
//             this.price=price;
//             this.index=index;
//         }
//      }


//     public static void main(String[] args) {
//         int stocks[]={100,80,60,70,60,75,85};
//         int span[]=new int[stocks.length];
//         stokspan(stocks,span);
//         for(int i=0;i<span.length;i++){
//             System.out.println(span[i]+" ");
//         }

//     }
// }

public class stockspan{
    
       public static void stokspanr(int prices[]){
    int span[]=new int[prices.length];
        Stack<Integer> st=new Stack<>();
       span[0]=1;
       st.push(0);
       for(int i=1;i<prices.length;i++){
        int curr=prices[i];
        while(!st.isEmpty() && curr>prices[st.peek()]){
            st.pop();
        }
        if(st.isEmpty()){
            span[i]=i+1;
                }
                else{
                    int prev=st.peek();
                    span[i]=i-prev;
                }
                st.push(i);
            }
            for (int i = 0; i < prices.length; i++) {
            System.out.print(span[i]);
        }
             }


    public static void stockspn(int stock[]){
        int n=stock.length;
       ArrayList<Integer> list=new ArrayList<>();
       Stack<Pair> st=new Stack<>();
       for(int i=0;i<n;i++){
       if(st.size()==0){
        list.add(-1);
       }
       else if(st.size()>0 && st.peek().price>stock[i]){
        list.add(st.peek().index);
       }
       else if(st.size()>0 && st.peek().price<=stock[i]){
        while(st.size()>0 && st.peek().price<=stock[i]){
            st.pop();
        }
            if(st.size()==0){
                list.add(-1);
            }
            else
            list.add(st.peek().index);
        }
        st.push(new Pair(stock[i],i));
       }
       for (int i = 0; i < stock.length; i++) {
            System.out.print((i-list.get(i))+" ");
        }
    }
    public static void main(String args[]){
        int stock[]={100,80,60,70,60,75,85};
        stokspanr(stock);
    }
    static class Pair{
        int price;
        int index;

        Pair(int price, int index){
            this.price=price;
            this.index=index;
        }
    }
}