import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PractiseAD {
    public static Map<Integer,Integer> createFrequencyMap(int arr[]){
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        return map;
    }
    public static List<Map.Entry<Integer,Integer>> createSorted(Map<Integer,Integer> map,int n){
        List<Map.Entry<Integer,Integer>> sortedEntries= new ArrayList<>(map.entrySet());
        sortedEntries.sort((a,b)->b.getValue().compareTo(a.getValue()));
        return sortedEntries;
    }
    public static void manipulateArray(int arr[],List<Map.Entry<Integer,Integer>> map){
       int index=0;
       for(Map.Entry<Integer,Integer> subMap:map){
            int key=subMap.getKey();
            int value=subMap.getValue();

            while(value>0){
                if(index>=arr.length) index=1;

                arr[index]=key;
                index+=2;
                value--;
            }
       }
       System.out.println(Arrays.toString(arr));
        
       }
    public static void main(String[] args) {
        int[] arr = {1,5,5,5,1,5,1,1,1};
        int n=arr.length;
        Map<Integer,Integer> map = createFrequencyMap(arr);
        List<Map.Entry<Integer,Integer>> sorted=createSorted(map,n);
        if(sorted.get(0).getValue() < n/2.0 +1){
            manipulateArray(arr,sorted);
        }
        else{
            System.out.println("not possible");
        }
    }
}
