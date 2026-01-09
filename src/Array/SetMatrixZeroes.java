package Array;

public class SetMatrixZeroes {
    public static void main(String[] args) {
      int matrix[][] = {
              {1,1,1},
              {1,0,1},
              {1,1,1}
      };
      
        setZero(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void setZero(int[][] matrix) {
        int n = matrix.length;
        int m =matrix[0].length;
        boolean col = false;

        for(int i=0;i<n;i++)
        {
            if(matrix[i][0] == 0)
            {
                col = true;

            }
            for(int j=1;j<m;j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=1;j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }

            }
            if (col)
            {
                matrix[i][0] = 0;
            }
        }
    }
}
