class Solution {
    public int singleNumber(int[] nums) {
        int i = 0;
        for (int x : nums){
            i^=x;
        }
        return i;
    }
}
