class Solution {
    public int thirdMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                secondMax = max;
                max = arr[i];
                
            }
            if(arr[i] > secondMax && arr[i] < max)
            {
                secondMax = arr[i];
            }
        }
        boolean flag = true;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= thirdMax && arr[i] < secondMax)
            {
                flag = false;
                thirdMax = arr[i];
            }
        }
        if(flag == false)
        return thirdMax;
        else
        return max;

    }
}