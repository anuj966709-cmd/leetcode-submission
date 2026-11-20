class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            int idx = Math.abs(nums[i])-1;
            nums[idx] = nums[idx]*(-1);
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 0)
            {
                l1.add(i+1);
            }
            if(nums[i] < 0)
            {
                nums[i] = nums[i]*(-1);
            }
        }
        for(int i = 0; i < nums.length; i++)
        {
            int idx = Math.abs(nums[i])-1;
            if(!(nums[idx] < 0))
            {
                nums[idx] = nums[idx]*(-1);
            }
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 0)
            {
                l1.remove(Integer.valueOf(i+1));
            }
        }
        return l1;
        
    }
}