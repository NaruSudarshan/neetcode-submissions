class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        freq = {}
        seen = set()
        for i in nums:
            if i not in seen:
                freq[i] = nums.count(i)

        for i in freq.values():
            if i > 1:
                return True
        return False   