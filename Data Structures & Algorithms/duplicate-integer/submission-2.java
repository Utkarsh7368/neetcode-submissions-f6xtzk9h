class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        Arrays.sort(nums);
        boolean res=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) {
                res=true;
            }   
        } 
        return res;
    }
}