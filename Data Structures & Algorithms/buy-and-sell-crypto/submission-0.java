class Solution {
    public int maxProfit(int[] prices) {
        int res=0,i=0;
        int buy=prices[0];
        while(i<prices.length){
            if(buy>prices[i]){
                buy=prices[i];
                i++;
            }
            else if(buy<prices[i]){
                int sell = prices[i];
                res=Math.max(sell-buy,res);
                i++;
            }
            else{
                i++;
            }
        }
        if(res<=0){
            return 0;
        }
        return res;
    }
}
