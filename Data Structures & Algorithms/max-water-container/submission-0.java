class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;
        int maxRes = 0;
        while(start < end){
            int res = area(start,end,heights);
            if(heights[start] < heights[end]) start++;
            else end--;
            maxRes = Math.max(res,maxRes);
        } 
        return maxRes;
    }
    public int area(int i,int j,int[] heights){
        return (int) Math.min(heights[i],heights[j]) * (j-i);
    }
}
