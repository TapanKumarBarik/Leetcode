class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        
        List<List<Integer>>list=new ArrayList();
        
        Arrays.sort(num);
        
        int n=num.length;
        for(int i=0;i<n;i++){
            
            if(i==0 || num[i]!=num[i-1]){

          int lo = i+1, hi = num.length-1, sum = 0 - num[i];
            while (lo < hi) {
                if (num[lo] + num[hi] == sum) {
                    list.add(Arrays.asList(num[i], num[lo], num[hi]));
                    while (lo < hi && num[lo] == num[lo+1]) lo++;
                    while (lo < hi && num[hi] == num[hi-1]) hi--;
                    lo++; hi--;
                } else if (num[lo] + num[hi] < sum) lo++;
                else hi--;
           }

            }
            
            
        }
        return list;
    }
}