class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int minbuy=prices[0];
        for(int i=1; i<prices.length; i++){
            if(minbuy>prices[i]){
                minbuy=prices[i];
                continue;
            }
            if(prices[i]-minbuy>max){
                max=prices[i]-minbuy;
            }
        }
        return max;
    }
}
