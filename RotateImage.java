class Solution {

    public void swapRows(int[][] matrix, int i, int j, int m)
        {
            for(int index = 0; index < m ; index++)
            {
                int temp = matrix[i][index];
                matrix[i][index] = matrix[j][index];
                matrix[j][index] = temp;
            }
        }
    public void rotate(int[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0 ; i < n/2 ; i++)
        {
            int j = n - 1 - i;
            swapRows(matrix, i, j, m);
        }

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i + 1 ; j < m ; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
