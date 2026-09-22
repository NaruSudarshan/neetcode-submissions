class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        seen = set()
        if len(s) != len(t):
            return False
        sArr = list(s)
        tArr = list(t)
        sArr.sort()
        tArr.sort()
        for i in range(len(sArr)):
            if sArr[i] != tArr[i]:
                return False
        return True