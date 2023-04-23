import java.util.HashMap;
public class majorel {
    public static void hash(int ar[]){
        int n=ar.length;
        HashMap<Integer,Integer> hmap=new HashMap<>();
       for(int i=0;i<n;i++){
        Integer m= hmap.get(ar[i]);
        if(hmap.get(ar[i])==null){
        hmap.put(ar[i],1);
        }
        else{
            hmap.put(ar[i],++m);
        }
       }
       System.out.print(hmap);
    }
    //___________________________________________________________________________
    static void hash2(int arr[])  
    {  
        /* Creates an empty HashMap */  
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();  
        for (int i = 0; i < arr.length; i++)   
        {  
            /* Get if the element is present */  
            Integer n = hashmap.get(arr[i]);  
            /* If this is first occurrence of element Insert the element */  
            if (hashmap.get(arr[i]) == null)   
            {  
                hashmap.put(arr[i], 1);  
            }  
            /* If element is already present in hash map Increment the count of element by 1 */  
            else   
            {  
                hashmap.put(arr[i], ++n);  
            }  
        }  
        /* Display HashMap */  
        System.out.println(hashmap);  
    }  
    /* Driver Code */  
    public static void main(String[] args)  
    {  
        int arr[] = { 1, 6, 5, 10, 6, 6, 10 };  
        hash(arr);  
    }  
}
