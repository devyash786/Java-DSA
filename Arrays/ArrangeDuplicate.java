import java.util.*;

public class ArrangeDuplicate {

    public static Map<Integer, Integer> createFrequencyMap(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return frequencyMap;
    }

    public static List<Map.Entry<Integer, Integer>> sortByFrequency(Map<Integer, Integer> frequencyMap) {
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(frequencyMap.entrySet());
        sortedEntries.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        return sortedEntries;
    }

    public static int[] arrangeAlternatively(List<Map.Entry<Integer, Integer>> sortedEntries, int n) {
        int[] result = new int[n];
        int index = 0;

        for (Map.Entry<Integer, Integer> entry : sortedEntries) {
            int num = entry.getKey();
            int freq = entry.getValue();

            while (freq > 0) {
                if (index >= n) index = 1;  // Fill even indices first, then odd indices

                result[index] = num;
                index += 2;  // Alternate between even and odd indices
                freq--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,5,5,1,5,1};
        int n = arr.length;
        
        Map<Integer, Integer> frequencyMap = createFrequencyMap(arr);

        
        
        List<Map.Entry<Integer, Integer>> sortedEntries = sortByFrequency(frequencyMap);
        System.out.println(sortedEntries.get(0).getValue() + " "+ (n/2.0+1));
        if( sortedEntries.get(0).getValue() < (n/2.0 + 1)){
        int[] result = arrangeAlternatively(sortedEntries, n);
        
        System.out.println(Arrays.toString(result));
        }
        else{
            System.out.println("No arrangement possible");
        }
       
        
        
    }
}

