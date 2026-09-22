class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> count = new HashMap<>();
        for(char ch : s.toCharArray()){
            count.put(ch,count.getOrDefault(ch,0) +1);
        }

        for(char ch : t.toCharArray()){
            count.put(ch,count.getOrDefault(ch,-1) - 1);
        }

        for(int i: count.values()){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
