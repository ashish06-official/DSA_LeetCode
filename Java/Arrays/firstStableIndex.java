class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] minsum = new int[n];
        minsum[n-1] = nums[n-1];
        for(int i = n-2; i>= 0 ; i--){
            minsum[i] = Math.min(minsum[i+1],nums[i]);
        }
        int max = 0;
        for(int j = 0 ; j < n ; j++){
            max = Math.max(nums[j] , max);
            int instablity = max - minsum[j];
            if(instablity <= k){
                return j;
            }

        }
        return -1;
    }
}
