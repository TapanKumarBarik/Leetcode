class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[]arr=new int[2];
        
        int i=0;
        int n=numbers.length-1;
        
        while(i<n){
            
            int temp=numbers[i]+numbers[n];
            if(temp==target){
                arr[0]=i+1;
                arr[1]=n+1;
                break;
                
            }
            
            else if(temp>target){
                n--;

            }
            else{
                i++;
            }
        }
        
        return arr;
    }
}