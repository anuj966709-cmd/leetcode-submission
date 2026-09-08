class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m; i++)
        {
            int min = 100001;
            int minIdx = -1;
            for(int j =  0; j < n; j++)
            {
                if(matrix[i][j] < min)
                {
                    min = matrix[i][j];
                    minIdx = j;
                }
            }
            boolean check = true;
            for(int k = 0; k < m; k++)
            {
                if(matrix[k][minIdx] > min)
                {
                    check = false;
                }
            }
            if(check == true)
            list.add(matrix[i][minIdx]);
        }
        return list; 
    }
}