// ==========================================================
// 215. Kth Largest Element in an Array
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 70 ms (Beats 54%)
// Memory     : 73.8 MB (Beats 70%)
// Link       : https://leetcode.com/problems/kth-largest-element-in-an-array/
// ==========================================================

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i:nums){
            q.add(i);
            if(q.size()>k){
                q.poll();
            }
        }
       
        return q.poll();
    }
}