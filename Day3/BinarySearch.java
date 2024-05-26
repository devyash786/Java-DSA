package Day3;

public class BinarySearch {
    public static void main(String[] args) {
        int nums[]={0, 1, 2,4, 5, 6, 7};
        int left=0;
        int target=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                System.out.println(mid);
                break;
            }
            else if(target<nums[mid]){

                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
    }
}
