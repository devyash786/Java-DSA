
/*Given an array, find unique pairs whose difference is value.
Input: arr: [4,8,2,6,5], value: 3
Output: [5, 8] [2, 5] */
import java.util.*;

public class UniqueDifference {
    public static void countDifferentPairs(int arr[], int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if (map.containsKey(Math.abs(k - num))) {
                //System.out.println(num + " " + Math.abs(k - num));
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(Math.abs(k - num));
                arrayList.add(num);
                list.add(arrayList);
                map.put(Math.abs(k - num), num);
            }
            if (map.containsKey(Math.abs(k + num))) {
                //System.out.println(num + " " + (k + num));
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(Math.abs(k + num));
                arrayList.add(num);
                list.add(arrayList);
                map.put(Math.abs(k + num), num);
            }
            map.put(num, k - num);
        }
        for(ArrayList<Integer> arrayList:list){
            System.out.println(arrayList.get(0)+" "+arrayList.get(1));
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 8, 2, 6, 5 };
        int n = arr.length;
        int k = 3;
        countDifferentPairs(arr, n, k);

    }
}