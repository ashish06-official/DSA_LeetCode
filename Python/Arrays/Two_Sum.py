class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}
        for i,j in enumerate(nums):
            find = target - j
            if find in seen:
                return[seen[find],i]
            else:
                seen[j] = i
        return []

