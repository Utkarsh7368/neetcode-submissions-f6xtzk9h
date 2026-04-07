class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        int[] res=new int[k];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i = 0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        } 
        //Implementing max heap
        //not using b[0]-a[0] bcoz it can cause integer overflow
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0])); 
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            pq.offer(new int[]{e.getValue(),e.getKey()});
        }
        for(int i=0;i<k;i++){
            res[i]=pq.poll()[1];
        }
        
        return res;
    }
}
