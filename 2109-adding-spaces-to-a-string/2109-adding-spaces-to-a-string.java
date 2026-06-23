class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);
        int k = 0;
        int j = 0;
        for(int i = 0; i < s.length() + spaces.length; i++)
        {
            if( k < spaces.length && i == spaces[k])
            {
                sb.insert(i+j,' ');
                k++;
                j++;
            }
        }
        String str = sb.toString();
        return str;
    }
}