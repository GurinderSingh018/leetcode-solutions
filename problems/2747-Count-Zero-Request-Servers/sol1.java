// ==========================================================
// 2747. Count Zero Request Servers
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 51 ms (Beats 35%)
// Memory     : 149.8 MB (Beats 45%)
// Link       : https://leetcode.com/problems/count-zero-request-servers/
// ==========================================================

class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs,(a,b)->a[1]-b[1]);
        int a=queries.length;
        int sorted[][]=new int[a][2];
        for(int i=0;i<a;i++){
            sorted[i][0]=queries[i];
            sorted[i][1]=i;
        }

        int arr[]= new int[a];
        Arrays.sort(sorted,(c,b)-> c[0]-b[0]);
        int left=0;
        int right=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<a;i++){
            int t=sorted[i][0];
            int idx=sorted[i][1];
            while(right<logs.length && logs[right][1]<=t){
                map.put(logs[right][0],map.getOrDefault(logs[right][0],0)+1);
                right++;
            }
            while(left<right && logs[left][1]<t-x){
                map.put(logs[left][0],map.getOrDefault(logs[left][0],0)-1);
                if(map.get(logs[left][0])==0) map.remove(logs[left][0]);
                left++;
            }
            arr[idx]=n-map.size();
        }
        return arr;
    }
}