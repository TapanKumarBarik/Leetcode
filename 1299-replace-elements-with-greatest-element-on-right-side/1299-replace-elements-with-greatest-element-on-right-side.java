class Solution {
    public int[] replaceElements(int[] arr) {
        
        
        int n=arr.length;
        
        
        int []res=new int[n];
        
        int currMax=-1;
        
        for(int i=n-1;i>=0;i--){
            
             res[i]=currMax;
            if(arr[i]>currMax){
                currMax=arr[i];
            }

        }
      
        return res;
    }
}