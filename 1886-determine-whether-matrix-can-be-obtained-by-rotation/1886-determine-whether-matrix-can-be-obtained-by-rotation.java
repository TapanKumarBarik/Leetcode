class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0; i < 4; i++) {
            if(Arrays.deepEquals(mat, target)) return true;
            rotate(mat);
        }
        return false;
    }
    
    void rotate(int[][] mat) {
        
//         Reverse Rows
        for(int i = 0, j = mat.length - 1; i < j; i++, j--) {
            int[] tempRow = mat[i];
            mat[i] = mat[j];
            mat[j] = tempRow;
        }
        
//         Transpose
        for(int i = 0; i < mat.length; i++) {
            for(int j = i + 1; j < mat.length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}