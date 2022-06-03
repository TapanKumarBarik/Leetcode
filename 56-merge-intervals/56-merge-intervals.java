class Solution {
    public int[][] merge(int[][] intervals) {
        
        
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<ArrayList<Integer>>arr=new ArrayList();
        
        ArrayList<Integer>list=new ArrayList();
        list.add(intervals[0][0]);
         list.add(intervals[0][1]);
        
        
        
        for(int i=1;i<intervals.length;i++){
            
            if(intervals[i][0]>list.get(1)){
                arr.add(new ArrayList(list));
                
                list.set(0,intervals[i][0]);
                list.set(1,intervals[i][1]);
                
            }
            else{
                 list.set(1,Math.max(intervals[i][1] ,list.get(1)  ));
            }
        }
        
          arr.add(new ArrayList(list));
        int[][]res=new int[arr.size()][2];
        
        for(int i=0;i<arr.size();i++){
            res[i][0]=arr.get(i).get(0);
            res[i][1]=arr.get(i).get(1);
            
        }
        return res;
    }
}