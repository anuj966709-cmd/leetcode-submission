class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        if(k >= arr.length)
        {
            k = arr.length-1;
        }
        for(int i = 0; i <= k; i++)
        {
            if(set.contains(arr[i]))
            return true;
            else
            set.add(arr[i]);
        }
        int i = 0;
        int j = k;
        while(j < arr.length-1)
        {
            set.remove(arr[i]);
            i++;
            j++;
            if(set.contains(arr[j]))
            return true;
            else
            set.add(arr[j]);
        }
        return false; 
    }
}