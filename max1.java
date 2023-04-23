// import javax.xml.transform.Source;

public class max1{

    public static int ct(int arr[]){
        int max=0;
        int ct=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                ct++;
            }
            else{
                ct=0;
            }
            if(ct>max){
                max=ct;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1, 0, 0, 1, 1, 0, 1, 0, 1, 1};
        int n=arr.length;
        int m=2;
        // int maxr=ct(arr);
        for(int i=0;i<n;i++){
           if (arr[i]==0){
               while(m<0){
                    if(arr[i]==0){
                        arr[i]=1;
                    }
                    m--;
               }
               System.out.println(ct(arr));
           }
        }
    }
}