class Solution:
  def containsDuplicate(self, nums: List[int]) -> bool:
    return len(nums) != len(set(nums)) # Since set cant contain duplicates 
