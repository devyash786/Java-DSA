package Day3;

public class PreFixSum {
    static void subArraySum(int arr[]){
        int currentSum=0,maxSum=Integer.MIN_VALUE,minSum=Integer.MAX_VALUE;

        int prefixArr[]=new int[arr.length];
        prefixArr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixArr[i]=prefixArr[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currentSum = i==0?prefixArr[j]: prefixArr[j]-prefixArr[i-1];
                if(currentSum>maxSum){
                    maxSum=currentSum;
                }
                if(currentSum<minSum){
                    minSum=currentSum;
                }
            }
        }
       System.out.println("maxSumIs: "+maxSum);
       System.out.println("minSum " +minSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        subArraySum(arr);
    }
}
//Time complexity: O(n^2)
//Space Complexity: O(n)
