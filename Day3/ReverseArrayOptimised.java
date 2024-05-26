package Day3;

public class ReverseArrayOptimised {
    static void reverse(int arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,7,8,9,10,11};
        reverse(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}
