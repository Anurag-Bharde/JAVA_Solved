public class spiral {
    public static void spil(int ar[][]){
        int srow=0;
        int scol=0;
        int erow=ar.length-1;
        int ecol=ar[0].length-1;

        while(srow<=erow && scol<=ecol){
            for(int i=scol;i<=ecol;i++){
                System.out.print(ar[srow][i]+" ");
            }
            for(int i=srow+1;i<=erow;i++){
                System.out.print(ar[i][ecol]+" ");
            }
            for(int i=ecol-1;i>=scol;i--){
                if(srow==erow){
                     break;
                }
                System.out.print(ar[erow][i]+" ");
            }
            for(int i=erow-1;i>=srow+1;i--){
                if(scol==ecol){
                    break;
                }
                System.out.print(ar[i][scol]+" ");
            }
            scol++;srow++;erow--;ecol--;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int ar[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spil(ar);
    }
}
