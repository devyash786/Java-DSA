package Day3;

public class TappingRainWaterProblem {
    public static int calculateRainVolume(int arr[]){
        int n=arr.length, waterTapped=0;
        int leftMax[]=new int[n];
        int rightMax[]=new int[n];

        leftMax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1], arr[i]);
        }
        rightMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1], arr[i]);
        }

        for(int i=0;i<n;i++){
            int waterLevel= Math.min(leftMax[i], rightMax[i]);
            waterTapped+=waterLevel-arr[i];
        }
        return waterTapped;
    }
    public static void main(String[] args) {
        int building1[]={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int building2[]={4, 2, 0, 3, 2, 5};
        System.out.println(calculateRainVolume(building1));
        System.out.println(calculateRainVolume(building2));
    }
    
}
