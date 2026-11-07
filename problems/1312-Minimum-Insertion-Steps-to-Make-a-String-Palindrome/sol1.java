// ==========================================================
// 1312. Minimum Insertion Steps to Make a String Palindrome
// Difficulty : Hard
// Language   : Java
// Solution   : #1
// Runtime    : 29 ms (Beats 34%)
// Memory     : 47.1 MB (Beats 54%)
// Link       : https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/
// ==========================================================

class Solution {
    public int minInsertions(String s) {
        StringBuilder sb=new StringBuilder(s);
        String s2= new String(sb.reverse());
        int m=s.length();
        int n=s2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
               
                if(s.charAt(i-1)==s2.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
               
            }
        }
        return s.length()-dp[m][n];
    }
}