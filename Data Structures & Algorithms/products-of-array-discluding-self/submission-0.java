class Solution {
    //brute force approach
    public int[] productExceptSelf(int[] nums) {
    int n=nums.length;
    int j=0,k=0,prod=1;
    int[] res=new int[n];
    for(int i=0;i<nums.length;i++){
        j=i+1;
        k=0;
        while(k<n-1){
            prod*=nums[j%n];
            j++;
            k++;
        }
        res[i]=prod;
        prod=1;
    }
    return res;
    }
}  
