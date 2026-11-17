// ==========================================================
// 72. Edit Distance
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 6 ms (Beats 40%)
// Memory     : 46.8 MB (Beats 64%)
// Link       : https://leetcode.com/problems/edit-distance/
// ==========================================================

class Solution {
     int dp[][];
    public int minDistance(String word1, String word2) {
          int m=word1.length();
          int n=word2.length();
         dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++) dp[i][0]=i;
        for(int j=0;j<=n;j++) dp[0][j]=j;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)) dp[i][j]=dp[i-1][j-1];
                else{
                    int delete=1+dp[i-1][j];
                    int insert=1+dp[i][j-1];
                    int replace=1+dp[i-1][j-1];
                    dp[i][j]=Math.min(delete,Math.min(insert,replace));
                }
            }
        }
        
         return dp[m][n];
    }
   
}