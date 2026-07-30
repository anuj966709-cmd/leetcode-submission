class Solution {
    public int maximumCount(int[] arr) {
        int n = arr.length;
        if(arr[0] > 0 || arr[n-1] < 0)
        return n;
        else if(arr[0] == 0 && arr[n-1] == 0)
        return 0;
        int i = 0;
        int j = n-1;
        int mid=0;
        int negCount=0;
        while(i <= j)
        {
            mid = (i+j)/2;
            if(arr[mid] >= 0)
            j = mid-1;
            else
            i = mid+1;
        }
        negCount = j+1;
        if(n%2==0 && negCount >= n/2)
        return negCount;
        else if(negCount >= (n/2)+1)
        return negCount;
        i = mid;
        j = n-1;
        int smid;
        int posCount=0;
        while(i <= j)
        {
            smid = (i+j)/2;
            if(arr[smid] > 0)
            j = smid-1;
            else
            i = smid+1;
        }
        posCount = n-i;
        if(posCount >= negCount)
        return posCount;
        else
        return negCount;  
    }
}