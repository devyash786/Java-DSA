package Arrays;

public class MaxMin {
 public static void main(String[] args) {
    int A[] = { 4, 9, 6, 5, 2, 3 };
    int maxValue=Integer.MIN_VALUE,minValue=Integer.MAX_VALUE;
    for(int i=0;i<A.length;i++){
        if(A[i]>maxValue){
            maxValue=A[i];
        }
        if(A[i]<minValue){
            minValue=A[i];        }
    }
    System.out.println(maxValue+" "+minValue);
 }   
}
