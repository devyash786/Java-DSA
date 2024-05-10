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

public class UniquePairsOptimized {
     public int UniquePairCount(int arr[]){
      HashSet<Integer> hashSet = new HashSet<>();
      for(int x:arr){
        hashSet.add(x);
      }
      return (int) Math.pow(hashSet.size(),2);
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3} ;
        UniquePairsBrute obj = new UniquePairsBrute();
        System.out.println(obj.UniquePairCount(arr));

    }
}
/*
 * Time Complexity O(n)
 * Space Complexity O(n)
 */
