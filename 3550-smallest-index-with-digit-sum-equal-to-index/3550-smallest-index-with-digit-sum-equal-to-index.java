class Solution {
    public int sumOfDigit(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            int rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++)
        {
            int ans = sumOfDigit(nums[i]);
            if(ans == i)
            return i;
        }
        return -1; 
    }
}