// ==========================================================
// 44. Wildcard Matching
// Difficulty : Hard
// Language   : Java
// Solution   : #1
// Runtime    : 22 ms (Beats 61%)
// Memory     : 62.7 MB (Beats 17%)
// Link       : https://leetcode.com/problems/wildcard-matching/
// ==========================================================

class Solution {
    int dp[][];
    public boolean isMatch(String s, String p) {
        int m=s.length();
        int n=p.length();
        dp=new int[m][n];
        for(int i=0;i<m;i++) Arrays.fill(dp[i],-1);
        return match(s,p,m-1,n-1)==1 ? true:false; 
    }
    int match(String s,String p,int i,int j){
        if(i<0 && j<0) return 1;
        if(i>=0 && j<0) return 0;
        if(i<0 && j>=0){
            for(int k=j;k>=0;k--) if(p.charAt(k)!='*') return 0;
            return 1;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?')return dp[i][j]= match(s,p,i-1,j-1);
        if(p.charAt(j)=='*') return dp[i][j]= Math.max(match(s,p,i,j-1), match(s,p,i-1,j));
        return dp[i][j]=0;
    }
}