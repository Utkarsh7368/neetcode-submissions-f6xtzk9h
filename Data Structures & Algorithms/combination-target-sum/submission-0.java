class Solution {
    List<List<Integer>> res=new ArrayList<>();
      int sum=0;
    private void backtrack(int idx,List<Integer> ls,int target,int[] nums){
        if(sum==target){
            res.add(new ArrayList<>(ls));
            return;
        }
        if(sum>target){
            return;
        }
        for(int i=idx;i<nums.length;i++){
            sum+=nums[i];
            ls.add(nums[i]);
            backtrack(i,ls,target,nums);
            sum-=nums[i];
            ls.remove(ls.size()-1);
            idx++;
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> ls=new ArrayList<>();
        backtrack(0,ls,target,nums);
        return res;
    }
}
