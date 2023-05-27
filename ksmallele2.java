import java.util.*;
public class ksmallele2 {
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        if(k<1 || k>arr.length){
            return -1;
        }
       return quicks(arr,0,arr.length-1,k-1);
        }
        
        
    public static int quicks(int arr[],int start,int end,int k){
        if(start==end){
            return arr[start];
        }
        int piv= partition(arr, start,end);
        if(piv==k) return arr[piv];
        else if(piv<k){
          return  quicks(arr,piv+1,end,k);
        }
        else
        return quicks(arr,start,piv-1,k);
    }
    
    
    public static int partition(int arr[],int start,int end){
        int pividx=start+new Random().nextInt(end-start+1);
        int piv=arr[pividx];
        swap(arr,pividx,end);
        
        int i=start;
        for(int j=start;j<arr.length;j++){
            if(arr[j]<=piv){
                swap(arr,i,j);
                i++;
            }
        }
        swap(arr,i,end);
        return i;
    }
    
    
    public static void swap(int arr[],int start,int end){
        int temp= arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
