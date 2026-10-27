class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs=new HashSet<>();
        for(int i: nums){
            hs.add(i);
        }
        int max=0;
        for(int i:nums){
            if(!hs.contains(i-1)){
          int curr=i;
          int res=1;
          while(hs.contains(curr+1)){
            res++;
            curr++;
          }max=Math.max(res,max);
            }
          
        }
        return max;
    }
}
