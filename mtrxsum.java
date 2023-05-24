public class mtrxsum{
    public static int matrixSum(int[][] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=0;
            for(int j=0;j<nums[i].length;j++){
                max=Math.max(nums[i][j],max);
            }
            sum=sum+max;
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[][]={{7,2,1},{6,4,2},{6,5,3},{3,2,1}};
        System.out.println(matrixSum(nums));   
    }
}