class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int j = k;
        for (int num : nums) {
            set.add(num);
        }

        while (set.contains(k)) {
            k = k + j;
        }

        return k;
    }
}
