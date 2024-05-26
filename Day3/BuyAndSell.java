package Day3;

public class BuyAndSell {
    public static int calculateProfit(int arr[]){
        int maxProfit=0,buyPrice=arr[0];

        for(int i=1;i<arr.length;i++){
            if(buyPrice<arr[i]){
                int profit=arr[i]-buyPrice;
                maxProfit=Math.max(maxProfit, profit);
            }else{
                buyPrice=arr[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int prices2[]={7, 6, 4, 3, 1};
        System.out.println(calculateProfit(prices));
        System.out.println(calculateProfit(prices2));
    }
}
