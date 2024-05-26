package Day3;

import java.util.Scanner;

public class HollowRectangle {
    public static void hollowRectangle(int row,int col){
        for(int i= 1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1 || i==row||j==1||j==col){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        hollowRectangle(sc.nextInt(),sc.nextInt());
    }
}
