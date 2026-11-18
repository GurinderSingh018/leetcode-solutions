// ==========================================================
// 2914. Minimum Number of Changes to Make Binary String Beautiful
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 98%)
// Memory     : 46 MB (Beats 87%)
// Link       : https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/
// ==========================================================

class Solution {
    public int minChanges(String s) {
        int n=s.length();
        int count=0;
        for(int i=1;i<n;i+=2){
            char a=s.charAt(i-1);
            char b=s.charAt(i);
            if(a!=b) count++;
        }
        return count;
    }
}