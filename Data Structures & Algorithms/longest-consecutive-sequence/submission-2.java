class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> hs=new HashSet<>();
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
            map.put(nums[i],i);
        }
        int count=0,res=0,i=0,j=0;
        while(i<nums.length){
            int n= nums[j];
            if(!hs.contains(n-1)){
                i++;
                j=i;
                count=0;
            }
            else{
                count++;
                j=map.get(n-1);
            }
            res=Math.max(res,count);
        }
        return res+1;
    }
}
