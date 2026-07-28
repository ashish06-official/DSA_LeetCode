class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {

        int n = nums.length;
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        int[] result = new int[n];

        int lsum = 0;
        int rsum = sum;
        for(int i = 0; i < n ; i++){
            int z = nums[i];
            rsum -= z;
            result[i] = z * i - lsum + rsum - z * (n - i -1);
            lsum += z;
        }
        return result; 


    }
}
