class Solution {
    public int maxProfit(int[] prices) {
        int maxRes = 0;
        int start = 0;
        int end = start + 1;
        while(end<prices.length){
            if(prices[start] < prices[end]){
                int res = prices[end] - prices[start];
                maxRes = Math.max(res,maxRes);
            }else{
                start = end;
            }
            end++;
        }
        return maxRes;
    }
}
