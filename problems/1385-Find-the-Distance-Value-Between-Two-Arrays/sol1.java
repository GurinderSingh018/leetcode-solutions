// ==========================================================
// 1385. Find the Distance Value Between Two Arrays
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 8 ms (Beats 24%)
// Memory     : 46.1 MB (Beats 61%)
// Link       : https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
// ==========================================================

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int ans=0;
        for(int x:arr1){
            int st=0;
            int en=arr2.length;
            while(st<en){
                int mid=st+(en-st)/2;
                if(arr2[mid]<x){
                    st=mid+1;
                }
                else{
                    en=mid;
                }
            }
            boolean valid=true;
           if(st<arr2.length && Math.abs(arr2[st]-x)<=d) valid=false;
           if(st>0 && Math.abs(arr2[st-1]-x)<=d) valid=false;
           if(valid) ans++;
        }
        return ans;
    }
}