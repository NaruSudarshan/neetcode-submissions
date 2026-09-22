class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int[] freq = new int[26];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int x : freq){
            if(x!=0) return false; 
        }
        return true;
    }
// Only lowercase English letters → int[26]
// Uppercase + lowercase English letters → int[128] (or 256)
// Case-insensitive → toLowerCase() + int[26]
// Any Unicode characters → HashMap<Character, Integer> or code-point-based handling
}
