class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        if(nums.length == 0)
        return 0;
        for(int i = 0; i < nums.length; i++)
        {
            set.add(nums[i]);
        }
        int i = 0;
        for(int ele : set)
        {
            nums[i] = ele;
            i++;
        }
        int max = 1;
        int count = 1;
        for(int j = 0; j < nums.length-1; j++)
        {
            if(nums[j+1]-nums[j] == 1)
            {
                count++;
                if(count > max)
                {
                    max = count;
                }

            }
            else
            {
                count = 1;
            }
        }
        return max;  
    }
}