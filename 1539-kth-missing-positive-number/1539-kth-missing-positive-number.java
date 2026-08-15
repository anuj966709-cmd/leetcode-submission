class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int mid = 0;
        int x = 0;
        while(i <= j)
        {
            mid = (i+j)/2;
            if(arr[mid]-(mid+1) < k)
            i = mid+1;
            else
            {
                j = mid-1;
            }
        }
        return k+(j+1);
        
    }
}