class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('b',0);
        map.put('a',0);
        map.put('l',0);
        map.put('o',0);
        map.put('n',0);
        for(int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            {
                if(ch == 'b' || ch == 'a' || ch == 'l' || ch == 'o'|| ch == 'n')
                {
                    if(map.containsKey(ch))
                    {
                        map.put(ch,map.get(ch)+1);
                    }
                    else
                    {
                        map.put(ch,1);
                    }
                }
            }
        }
        map.put('l',map.get('l')/2);
        map.put('o',map.get('o')/2);
        int min = Integer.MAX_VALUE;
        for(int ele : map.values())
        {
            if(ele < min)
            min = ele;
        }
        return min;
        
    }
}