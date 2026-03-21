class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy = prices[0] # buying at day 1
        profit = 0
        for i in range(1,len(prices)):
            if prices[i] < buy :
                buy = prices[i]
            elif prices[i] - buy > profit:
                profit = prices[i] - buy
        return profit
