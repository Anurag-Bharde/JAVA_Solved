// import java.util.*;
public class bs {
    public static int bst(int num[], int k){
            int start=0, end =num.length -1 ;
            while (start<=end){
                int mid = (start + end)/2;
               if(num[mid]==k){
                return mid;
               }
               if(num[mid]<k){
                start=mid+1;
               }
               else end=mid-1;
                
            }
            return -1;
    }
    public static void main(String args[]){
        int ar[]={1,2,3,4,5,6,7,8,9};
        int key=10;         
         
            System.out.println("no is" + bst(ar,key));
        }
    }
    
