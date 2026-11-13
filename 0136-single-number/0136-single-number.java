class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele : nums)
        {
            if(map.containsKey(ele))
            {
                map.put(ele,map.get(ele)+1);
            }
            else
            {
                map.put(ele,1);
            }
        }
        for(int ele : map.keySet())
        {
            if(map.get(ele) == 1)
            return ele;
        }
        return 0;
    }
}