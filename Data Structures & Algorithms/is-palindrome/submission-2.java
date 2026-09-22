class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }

        String s1 = sb.toString();
        int start = 0;
        int end = s1.length()-1;
        while(start < end){
            if(s1.charAt(start)!=s1.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
