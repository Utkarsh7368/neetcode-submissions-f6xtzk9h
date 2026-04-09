class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i : nums){
            hs.add(i);
        }
        int count=0,res=0;
        for(int i=0;i<nums.length;i++){
        int n =nums[i];
        
        while(hs.contains(n)){ 
            count++;
            n++;
        }
         res=Math.max(res,count);
        n=0;
        count=0;
        }
        return res;
    }
}
