// ==========================================================
// 44. Wildcard Matching
// Difficulty : Hard
// Language   : Java
// Solution   : #2
// Runtime    : 62 ms (Beats 12%)
// Memory     : 47.1 MB (Beats 51%)
// Link       : https://leetcode.com/problems/wildcard-matching/
// ==========================================================

class Solution {
    
    public boolean isMatch(String s, String p) {
        int m=s.length();
        int n=p.length();
       boolean dp[][]=new boolean[m+1][n+1];
       dp[0][0]=true;
       for(int i=1;i<=m;i++){
          dp[i][0]=false;
       }
       for(int i=1;i<=n;i++){
           boolean flag=true;
           for(int j=1;j<=i;j++){
            if(p.charAt(j-1)!='*') {
                flag=false;
                break;
            }
           }
           dp[0][i]=flag;
       }
       for(int i=1;i<=m;i++){
           for(int j=1;j<=n;j++){
            if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){
                dp[i][j]=dp[i-1][j-1];
            }
            else if(p.charAt(j-1)=='*'){
                dp[i][j]=dp[i-1][j] || dp[i][j-1];
            }
            else dp[i][j] =false;
           }
       }
       return dp[m][n];
    }
    
}