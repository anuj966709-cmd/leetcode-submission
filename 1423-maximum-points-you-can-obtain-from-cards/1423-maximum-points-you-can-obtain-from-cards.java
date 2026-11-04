class Solution {
    public int maxScore(int[] arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++)
        {
            sum = sum + arr[i];
        }
        int maxSum = 0;
        int a = k-1;
        int j = arr.length-1;
        for(int i = 1; i <= k; i++)
        {
            if(sum >= maxSum)
            {
                maxSum = sum;
            }
            sum = sum-arr[a];
            a--;
            sum = sum + arr[j];
            j--;
        }
        if(sum > maxSum)
        {
            maxSum = sum;
        }
        return maxSum;
    }
}