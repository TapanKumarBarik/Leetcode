class Solution {
    public void rotate(int[][] matrix) {
        
        
        int n=matrix.length;
        //tranpose
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                
                swap(matrix, i, j);
            }
        }
        //reverse;
        
        for(int i=0;i<n;i++){
            reverse(matrix[i]);
        }
    }
    
    private void swap(int[][]matrix, int i, int j){
        
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
            
    }
    
    private void reverse(int[]matrix){
        
        int i=0;
        int n=matrix.length-1;
        
        while(i<n){
            int temp=matrix[i];
            matrix[i]=matrix[n];
            matrix[n]=temp;
            i++;
            n--;
        }
    }
}