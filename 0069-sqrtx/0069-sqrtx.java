class Solution {
    public int mySqrt(int x) {
        if(x==0)
        return 0;
        if(x==1)
        return 1;
        long i = 0;
        long j = x/2;
        while(i <= j)
        {
            long mid = (i+j)/2;
            if(mid*mid>x)
            j = mid-1;
            else if(mid*mid<x)
            i = mid+1;
            else
            return (int)mid;
        }
        return (int)j;
    }
}