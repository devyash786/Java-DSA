package Day3;

public class StockBuySell {
    public static int calculateMaxProfit(int stock[]){
        int buyPrice=Integer.MAX_VALUE, maxProfit=Integer.MIN_VALUE;

        for(int i=0;i<stock.length;i++){
            if(buyPrice<stock[i]){
               int  profit=stock[i]-buyPrice;
               maxProfit=Math.max(profit, maxProfit);
            }else{
                buyPrice=stock[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int stock[] = {7,1,5,3,6,4};
        System.out.println(calculateMaxProfit(stock));
    }
}
