

import java.util.*;

public class ChocolateDistribution {
    public static int chocolateDistribution(int arr[], int m) {
        if (arr.length == 0 || m == 0)
            return 0;

        Arrays.sort(arr);
        if (m > arr.length) {
            return -1;
        }
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currentMin = -1;
            int nextGraterIndex = i + m - 1;
            if (nextGraterIndex >= arr.length) {
                break;
            }
            currentMin = arr[nextGraterIndex] - arr[i];
            minValue = Math.min(minValue, currentMin);
        }
        return minValue;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 3, 2, 4, 9, 12, 56 };
        int m = 3;

        // Calculate the result using the chocolateDistribution method
        int result = chocolateDistribution(arr, m);
        if (result != -1) {
            System.out.println("Minimum difference is " + result);
        } else {
            System.out.println("Invalid input");
        }
    }

}
