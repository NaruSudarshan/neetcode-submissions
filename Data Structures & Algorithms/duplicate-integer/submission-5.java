
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int x : nums){
            if(!hs.contains(x)){
                hs.add(x);
            }else return true;
        }
        return false;
    }
}