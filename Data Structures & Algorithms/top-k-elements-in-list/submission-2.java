class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        int[] res=new int[k];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i = 0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        } 
        List<int[]> ls = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            ls.add(new int[]{e.getValue(),e.getKey()});
        }
        ls.sort((a,b)->Integer.compare(b[0],a[0]));
        
        for(int i=0;i<k;i++){
            res[i]=ls.get(i)[1];
        }
        
        return res;
    }
}
