class Solution {
   Set<Integer> col = new HashSet();
 Set<Integer> di1 = new HashSet();
 Set<Integer> di2 = new HashSet();
public int totalNQueens(int n) {
    return totalNQueensHelper(0, 0, n);
}

private int totalNQueensHelper(int row, int count, int n) {
    
    for (int i = 0; i < n; i++) {
        if (col.contains(i) ||di1.contains(row + i) || di2.contains(row-i)){
              continue;
        }      
        // we can now place a queen here
        if (row == n-1)  count++;
          
        else {
            col.add(i);
            di1.add(row+i);
            di2.add(row-i);
            count = totalNQueensHelper(row+1, count, n);
            // recover
            col.remove(i);
            di1.remove(row+i);
            di2.remove(row-i);
        }
    }
    
    return count;
}
}