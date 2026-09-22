class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(ch == '{') st.push('}');
            else if(ch == '[') st.push(']');
            else if(ch == '(') st.push(')');
            else{
                if(!st.isEmpty() && ch == st.peek()) st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }
}
