class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(st.size() == 0 || st.peek() != s.charAt(i))
            {
                st.push(s.charAt(i));
            }
            else
            {
                st.pop();  
            }
        }
        StringBuilder sb = new StringBuilder();
        while(st.size() != 0)
        {
            sb.insert(0, st.pop());
        }
        String s2 = sb.toString();
        return s2;
    }
}