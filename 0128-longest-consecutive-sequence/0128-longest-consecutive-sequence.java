class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        if(nums.length == 0)
        return 0;
        for(int i = 0; i < nums.length; i++)
        {
            set.add(nums[i]);
        }
        int max = 1;
        for(int ele : set)
        {
            if(!set.contains(ele-1))
            {
                int count = 1;
                int num = ele;
                while(set.contains(num+1))
                {
                    count++;
                    if(count >  max)
                    {
                        max = count;
                    }
                    num++;
                }
            }
        }
        return max;
    }
}