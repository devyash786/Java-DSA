package Day3;

public class KadaneAlgorithm {
    static void subArraySum(int arr[]){
        int currentSum=arr[0],maxSum=arr[0];
        for(int i=1;i<arr.length;i++){
            currentSum=Math.max(currentSum+arr[i], arr[i]);
            maxSum=Math.max(currentSum,maxSum);
            
        }
        System.out.println("max is "+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        subArraySum(arr);
    }
}
