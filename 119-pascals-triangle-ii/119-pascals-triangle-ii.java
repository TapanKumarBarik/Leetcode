class Solution {
    public List<Integer> getRow(int k) {
        
               Integer[] arr = new Integer[k + 1];
        Arrays.fill(arr, 1);
        
        for (int i = 1; i <= k; i++) 
            for (int j = i-1; j > 0; j--) 
                arr[j] = arr[j] + arr[j - 1];
        
        return Arrays.asList(arr);
    }
}