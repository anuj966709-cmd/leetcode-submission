class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        if(arr.length == 1)
        return 1;
        Arrays.sort(arr);
        int count = 0;
        int i = 0;
        int j = arr.length-1;
        while(i <= j)
        {
            if(arr[j] == limit)
            {
                count++;
                j--;
            }
            if(j >= 0 && arr[i]+ arr[j] <= limit)
            {
                count++;
                i++;
                j--;
            }
            else if(j >= 0 && arr[i]+ arr[j] > limit)
            {
                count++;
                j--;
            }
        }
        return count;  
    }
}