// ==========================================================
// 516. Longest Palindromic Subsequence
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 72 ms (Beats 5%)
// Memory     : 62.5 MB (Beats 89%)
// Link       : https://leetcode.com/problems/longest-palindromic-subsequence/
// ==========================================================

class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb=new StringBuilder(s);
        String s2= new String(sb.reverse());
        int m=s.length();
        int n=s2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                int pick=0;
                if(s.charAt(i-1)==s2.charAt(j-1)) pick=1+dp[i-1][j-1];
                int not= Math.max(dp[i-1][j],dp[i][j-1]);
                dp[i][j]=Math.max(pick,not);
            }
        }
        return dp[m][n];
    }
}