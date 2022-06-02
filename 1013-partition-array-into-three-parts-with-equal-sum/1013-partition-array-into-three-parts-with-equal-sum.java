class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        
        if(sum%3!=0)return false;
        
        int temp=sum/3;
        sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==temp){
                sum=0;
                count++;
            }
            if(count==3)return true;
            
        }
        
        
        return false;
        
        
    }
}