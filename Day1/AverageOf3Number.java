/*
 * In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers
 */
package Day1;
import java.util.*;

public class AverageOf3Number{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int $=sc.nextInt();
        int c=sc.nextInt();
        double avg= (a+$+c)/3.0;
        System.out.println(avg);
        sc.close();
    }
}