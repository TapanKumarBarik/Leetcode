class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        
        int[][]arr=new int[m][n];
        
        int index=0;
         int k=original.length;
        if(m*n!=k)return  new int[0][0];
        
       
        
      for(int i=0;i<m;i++){
          
          for(int j=0;j<n;j++){
              
              if(index<k){
                  arr[i][j]=original[index];
                  index++;
              }
              else{
                  break;
              }
          }
      }
        return arr;
    }
}