class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum = 0;
        for(int[] c : accounts){
            for(int x : c){
                sum += x;
            }
            if(max <= sum){
                 max = sum;
            }
            sum = 0;
        }
        return max;
    }
}
