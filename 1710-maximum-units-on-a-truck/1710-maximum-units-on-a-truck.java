class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        
     Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        
        
        
        int n=boxTypes.length;
        int res=0;
        for(int i=0;i<n;i++){
            
            if(truckSize>=boxTypes[i][0])
            
           {
                 res+=boxTypes[i][0]*boxTypes[i][1];
                truckSize-=boxTypes[i][0];
            }
            else{
                  res+=truckSize*boxTypes[i][1]; 
                    return res;
            }
            
            
        }
        
        return res;

    }
}