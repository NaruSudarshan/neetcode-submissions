class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int l = 0 ,r = 0;
        int maxLen = 0;
        while(r<s.length()){
            char pres = s.charAt(r);
            while(seen.contains(pres)){
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(pres);
            
            int len = r - l + 1;
            maxLen = Math.max(len,maxLen);
            r++;
        }
        return maxLen;
    }
}
