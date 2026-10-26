class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int[] preffix=new int[n];
        int[] suffix=new int[n];
       preffix[0]=nums[0];
       suffix[n-1]=nums[n-1];
       for(int i=1;i<n;i++){
            preffix[i]=preffix[i-1]*nums[i];
       }
       for (int i = n - 2; i >= 0; i--) {
    suffix[i] = suffix[i + 1] * nums[i];
}
       res[0]=suffix[1];
       res[n-1]=preffix[n-2];
       for(int i=1;i<n-1;i++){
            res[i]=preffix[i-1]*suffix[i+1];
       }
        return res;
    }
}  
