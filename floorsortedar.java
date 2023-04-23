public class floorsortedar {
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
   public static int findFloor(long arr[], int n, long x)
    {
        if(x<arr[0]){
            System.out.println("ok");
            return -1;
        }
        int i=0;
        while(i<n){
        if(arr[i]<x){
            i++;
            return i;
        }
        }
        return -1;
    }
    
	public static void main(String args[]) {
		// Your code goes here
		long ar[]={1,2, 8, 10, 11, 12, 19};
		int n=7;
		long x=5;
	    System.out.println(findFloor(ar,n,x));
    }
}