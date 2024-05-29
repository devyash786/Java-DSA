import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrangeElemetns {
    public static Map<Integer,Integer> createFrequencyMap(int nums[],int n){
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return map;
    }
    public static List<Map.Entry<Integer,Integer>> createSortedList(Map<Integer,Integer> map){
        List<Map.Entry<Integer,Integer>> sortedEntry = new ArrayList<>(map.entrySet());
        sortedEntry.sort((a,b)->b.getValue().compareTo(a.getValue()));
        return sortedEntry;
    }
    public static void arrangeElements(List<Map.Entry<Integer,Integer>> map,int nums[]){
        int index=0;
        for (Map.Entry<Integer,Integer> subMap : map) {
            int key = subMap.getKey();
            int value=subMap.getValue();
            while(value>0){
                if(index>=nums.length) index=1;
                nums[index]=key;
                index+=2;
                value--;
            }
            
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] arr = {1,5,5,5,1,5,1};
        int n = arr.length;

        Map<Integer,Integer> map = createFrequencyMap(arr,n);
        System.out.println(map);
        List<Map.Entry<Integer,Integer>> sortedEntires=createSortedList(map);
        System.out.println(sortedEntires);
        if(sortedEntires.get(0).getValue()<n/2.0+1){
            arrangeElements(sortedEntires,arr);
        }
        else{
            System.out.println("Not possible");
        }
    }
}
