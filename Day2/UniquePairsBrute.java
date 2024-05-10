/*
 * Given an array of N elements, the task is to find all the unique pairs that can be formed using the elements of a given array. 
Examples: 

Input: arr[] = {1, 1, 2} 
Output: 4 
(1, 1), (1, 2), (2, 1), (2, 2) are the only possible pairs.

Input: arr[] = {1, 2, 3} 
Output: 9 
 */


package Day2;

import java.util.HashSet;
import java.util.Set;
import java.awt.*;
public class UniquePairsBrute {
    public int UniquePairCount(int arr[]){

        Set<Point> mySet = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                mySet.add(new Point(arr[i], arr[j]));
            }
        }

        return mySet.size();
    }
    
    public static void main(String args[]){
        int arr[] = {1, 2, 3} ;
        UniquePairsBrute obj = new UniquePairsBrute();
        System.out.println(obj.UniquePairCount(arr));

    }
}
/*
 * Time Complexity O(n^2)
 * Space Complexity O(n)
 */