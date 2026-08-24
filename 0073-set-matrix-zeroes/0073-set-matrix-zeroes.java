class Solution {
    public void setZeroes(int[][] arr) {
        ArrayList<ArrayList<Integer>> l1 = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(arr[i][j] == 0)
                {
                    ArrayList<Integer> l2 = new ArrayList<>();
                    l2.add(i);
                    l2.add(j);
                    l1.add(l2);
                }
            }
        }
        for(int k = 0; k < l1.size(); k++)
        {
            // for rows
            for(int a = 0; a < n; a++)
            {
                arr[l1.get(k).get(0)][a] = 0;
            }
            // for columns
            for(int b = 0; b < m; b++)
            {
                arr[b][l1.get(k).get(1)] = 0;
            }
        }
        
    }
}