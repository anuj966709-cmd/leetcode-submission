class Solution {
    public int maxNumberOfBalloons(String s) {
        String target = "balloon";
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(int i = 0; i < target.length(); i++)
        {
            char ch = target.charAt(i);
            if(map1.containsKey(ch))
            {
                map1.put(ch,map1.get(ch)+1);
            }
            else
            {
                map1.put(ch,1);
                map2.put(ch,0);
            }
        }
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(map2.containsKey(ch))
            {
                map2.put(ch,map2.get(ch)+1);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < target.length(); i++)
        {
            char ch = target.charAt(i);
            int ans = map2.get(ch)/map1.get(ch);
            if(ans < min)
            min = ans;
        }
        return min;
    }
}