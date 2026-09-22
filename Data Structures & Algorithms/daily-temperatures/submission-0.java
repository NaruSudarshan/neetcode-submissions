class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Deque<Integer> st = new ArrayDeque<>();
        int[] res = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {

            while (!st.isEmpty() &&
                   temperatures[i] > temperatures[st.peek()]) {

                int prevIndex = st.pop();
                res[prevIndex] = i - prevIndex;
            }

            st.push(i);
        }

        return res;
    }
}