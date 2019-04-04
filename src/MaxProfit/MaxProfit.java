package MaxProfit;

public class MaxProfit {
    public static void main(String[] args) {
        int [] gain = { 3, 1, 4, 5, 8, 5, 2, 3, 8, 2, 3, 5, 6 };
        int maxProfit = new MaxProfit().getMaxProfit(gain);
        System.out.println("Max Profit: " + maxProfit);
    }

    public int getMaxProfit(int [] gain){
        int maxProfit = 0;

        for(int i = 0; i < gain.length; i++){
            for(int j = i + 1; j < gain.length; j++){
                int profit = gain[j] - gain[i];
                if(profit > maxProfit)
                    maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
