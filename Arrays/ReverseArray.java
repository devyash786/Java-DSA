package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 4, 9, 6, 5, 2, 3 };
        int left=0,right=arr.length-1;
        while(left<=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
