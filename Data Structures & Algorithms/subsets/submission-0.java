class Solution {
    List<List<Integer>> res=new ArrayList<>();
    private void backtrack(int idx, List<Integer> ls,int[] nums,int n){
        res.add(new ArrayList<>(ls));
        for(int i=idx;i<n;i++){
            ls.add(nums[i]);
            backtrack(i+1,ls,nums,n);
            ls.remove(ls.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<Integer> ls=new ArrayList<>();
        backtrack(0,ls,nums,n);
        return res;
    }
}
