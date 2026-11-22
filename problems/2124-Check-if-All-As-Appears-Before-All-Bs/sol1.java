// ==========================================================
// 2124. Check if All A's Appears Before All B's
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 55%)
// Memory     : 42.3 MB (Beats 69%)
// Link       : https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
// ==========================================================

class Solution {
    public boolean checkString(String s) {
        int n=s.length();
        boolean b=false;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='b') b=true;
            if(b && ch=='a') return false;
        }
        return true;
    }
}