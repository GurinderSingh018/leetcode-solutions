// ==========================================================
// 115. Distinct Subsequences
// Difficulty : Hard
// Language   : Java
// Solution   : #1
// Runtime    : 22 ms (Beats 30%)
// Memory     : 54.1 MB (Beats 49%)
// Link       : https://leetcode.com/problems/distinct-subsequences/
// ==========================================================

class Solution {
    int dp[][];
    public int numDistinct(String s, String t) {
      int m=s.length();
      int n=t.length();
       dp=new int[m][n];
       for(int i=0;i<m;i++) Arrays.fill(dp[i],-1);
      return subseq(s,t,m-1,n-1);
    }
    int subseq(String s,String t,int i,int j){
        if(j<0) return 1;
        if(i<0)return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]= subseq(s,t,i-1,j-1)+subseq(s,t,i-1,j);
        }
        return dp[i][j]=subseq(s,t,i-1,j);
    }
}