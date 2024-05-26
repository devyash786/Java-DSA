package Day3;

public class KadaneAlgorithm {
    static void subArraySum(int arr[]){
        int currentSum=0,maxSum=Integer.MIN_VALUE;
        for(int i: arr){
            currentSum+=i;
            if(currentSum<0){
                currentSum=0;
            }
            if (maxSum<currentSum) {
                maxSum=currentSum;
                
            }
        }
        System.out.println("max is "+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        subArraySum(arr);
    }
}
