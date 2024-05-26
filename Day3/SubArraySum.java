package Day3;

public class SubArraySum {
    static void subArraySum(int arr[]){
       int currentSum=0,maxSum=Integer.MIN_VALUE,minSum=Integer.MAX_VALUE;
       for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            currentSum=0;
            for(int k=i;k<=j;k++){
                currentSum+=arr[k];
            }
            System.out.println(currentSum);
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
//Time:- O(n^3)