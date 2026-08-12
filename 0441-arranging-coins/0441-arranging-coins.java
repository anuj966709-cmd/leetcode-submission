class Solution {
    public int arrangeCoins(int n) {
        if(n==1)
        return 1;
        int count = 0;
        int i = 1;
        while(n > 0)
        {
            n = n-i;
            count++;
            i++;
        }
        if(n==0)
        return count;
        return count-1;
        
    }
}