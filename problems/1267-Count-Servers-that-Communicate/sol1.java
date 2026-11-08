// ==========================================================
// 1267. Count Servers that Communicate
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 100%)
// Memory     : 54.8 MB (Beats 72%)
// Link       : https://leetcode.com/problems/count-servers-that-communicate/
// ==========================================================

class Solution {
    public int countServers(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int ans=0;
        int row[]=new int[m];
        int col[]=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && (row[i]>1|| col[j]>1)) ans++;
            }
        }
        return ans;
    }
   
}