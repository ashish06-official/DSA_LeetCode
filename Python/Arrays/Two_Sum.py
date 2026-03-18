class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}
        for i,j in enumerate(nums):
            find = target - j # the number with which another one can be added to get target
            if find in seen:
                return[seen[find],i] # returns the index of the elemnt and find whose sum is target
            else:
                seen[j] = i
        return []

