// ==========================================================
// 3360. Stone Removal Game
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 41.3 MB (Beats 93%)
// Link       : https://leetcode.com/problems/stone-removal-game/
// ==========================================================

class Solution {
    public boolean canAliceWin(int n) {
        int req=10;
        while(n>=req){
            n-=req;
            req--;
        }
        return req%2==0? false:true;
    }
}