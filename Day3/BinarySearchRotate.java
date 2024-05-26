package Day3;
/*There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown
pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k],
nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For
example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and
become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the
index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 0
Output: 4
Example 2:
Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 3
Output: -1
Example 3:
Input: nums = [1], target = 0
Output: -1 */
public class BinarySearchRotate {
    public static int findIndex(int arr[],int target){
        int min=searchMinIndex(arr);
        System.out.println("min ="+min);
        if(target>=arr[min] && target <=arr[arr.length-1]){
            return search(arr,min,arr.length-1,target);
        }
        else{
            return search(arr,0,min,target);
        }
    }
    public static int search(int arr[],int left,int right,int target){
        int l=left;
        int r=right;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                return mid;
            }        
            else if(arr[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
    public static int searchMinIndex(int arr[]){
        int left=0,right=arr.length-1;
        
        while(left<right){
            int mid=left+(right-left)/2;
            if(mid>0 && arr[mid-1]>arr[mid]){
                return mid;
            }
            else if(arr[mid]>=arr[left] && arr[mid]>arr[right]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
       int nums[]={4, 5, 6, 7, 0, 1, 2};
       int nums1[]={1};
       System.out.println(findIndex(nums,0));
       System.out.println(findIndex(nums,3));
       System.out.println(findIndex(nums1,0));
    }
}
