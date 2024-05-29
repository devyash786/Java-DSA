package BasicSorting;

public class BubbleSort {
    public static void bubbleSort(int nums[]){
        int n=nums.length;
      for(int i=0;i<n-1;i++){
        for(int j=0;j<n-1-i;j++){
            if(nums[j]>nums[j+1]){
                int temp = nums[j+1];
                nums[j+1]=nums[j];
                nums[j]=temp;
            }
        }
      }
      for (int i : nums) {
        System.out.print(i+" ");
      }
    }
    public static void selectionSort(int nums[]){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n-1;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[minIndex];
            nums[minIndex]=temp;

        }
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
    public static void insertionSort(int nums[]){
        int n= nums.length;
        for(int i=1;i<n;i++){
            int current=nums[i];
            int prev=i-1;
            while(prev>=0 && nums[prev]>current){
                nums[prev+1]=nums[prev];
                prev--;
            }
            nums[prev+1]=current;
        }
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int nums[]={3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        bubbleSort(nums);
        System.out.println();
        selectionSort(nums);
        System.out.println();
        insertionSort(nums);
    }
}
