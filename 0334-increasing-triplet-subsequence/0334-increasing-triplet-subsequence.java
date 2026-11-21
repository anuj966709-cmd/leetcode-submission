class Solution {
    public boolean increasingTriplet(int[] nums) {
        int nums1 = Integer.MAX_VALUE;
        int nums2 = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            int nums3 = nums[i];
            if(nums3 < nums1)
            {
                nums1 = nums3;
            }
            else if(nums3 < nums2 && nums3 > nums1)
            {
                nums2 = nums3;
            }
            if((nums1 < nums2) && (nums2 < nums3))
            return true;
        }
        return false;
        
    }
}