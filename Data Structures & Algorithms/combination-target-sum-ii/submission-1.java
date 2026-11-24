class Solution {
     List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0,0,candidates,target,list);
        return res;
    }
    private void backtrack(int idx,int sum,int[] candidates,int t,List<Integer> list ){
        if(sum==t){
            res.add(new ArrayList<>(list));
            return;
        }
        else if(sum>t){
            return;
        }
        for(int i=idx;i<candidates.length;i++){
             if (i > idx && candidates[i] == candidates[i-1])
                continue;

            int c = candidates[i];

            if (sum + c > t)
            {
                break;
            }
                list.add(c);
                backtrack(i+1,sum+c,candidates,t,list);
                list.remove(list.size()-1);
        }
    }
}