class Solution {
    public int count = 0;
    public int numberOfSteps(int num) {
        return countSteps(num);  
    }

    public int countSteps(int n)
    {
        if(n == 0)
        return count;

        if(n%2 == 0)
        {
            count++;
            return countSteps(n/2);
        }
        else
        {
            count++;
            return countSteps(n-1);
        } 
    }
}