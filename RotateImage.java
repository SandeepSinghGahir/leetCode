class Solution {
    public void rotate(int[][] matrix) {
        transposeMatrix(matrix);                
        flipSymmetry(matrix);
    }
        
    /** Transpose a matrix by runnning through half of the elements**/
    public void transposeMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp =matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;                
            }
        }

    }
    // Flip the matrix vertically
    public void flipSymmetry(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            int back_index=matrix[0].length-1;
            for(int j=0;j<matrix[0].length/2;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][back_index];
                matrix[i][back_index--]=temp;
                
            }
        }
    }
}