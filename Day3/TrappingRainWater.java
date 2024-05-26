package Day3;

public class TrappingRainWater {
    public static int trappingRainWater(int height[]){
        int n=height.length;
        int leftMax[]=new int[n];
        int rightMax[]= new int[n];

        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1], height[i]);
        }
        rightMax[n-1]=height[n-1];
        for (int i = n-2; i >=0; i--) {
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
            
        }
        int waterTapped=0;
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftMax[i], rightMax[i]);
            waterTapped+=waterLevel-height[i];
        }
        return waterTapped;
    }

    public static void main(String[] args) {
        int height[] ={4,2,0,6,3,2,5,11};
        System.err.println(trappingRainWater(height));
    }
    
}
//Time Complexity:- O(n)
