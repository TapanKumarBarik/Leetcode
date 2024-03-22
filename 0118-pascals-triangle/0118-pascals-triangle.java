class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>>arr=new ArrayList();
        
        for(int i=0;i<numRows;i++){
            List<Integer>temp=new ArrayList();
            
            for(int j=0;j<=i;j++){
                
                if(i==0 || j==0 || i==j){
                    temp.add(1);
                }
                else{ 
                    temp.add(arr.get(i-1).get(j)+ arr.get(i-1).get(j-1) );
                }
            }
            arr.add(temp);
        }
        return arr;
    }
}