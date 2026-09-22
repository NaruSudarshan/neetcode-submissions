class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int e = 0;
        for(int pile:piles){
            e = Math.max(e,pile);
        }
        while(s<e){
            int mid = (s+e)/2;
            if(canFinish(mid,h,piles)) e = mid;
            else s = mid+1;
        }
        return s;
    }

    public boolean canFinish(int k,int h,int[] piles){
        long hours = 0;
        for(int pile:piles){
            hours += Math.ceil((double)pile/k);
            if (hours>h) return false;
        }
        return true;
    }
}
