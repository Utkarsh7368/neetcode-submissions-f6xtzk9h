class Solution {
    public int maxArea(int[] heights) {
        int res=0,i=0,j=heights.length-1;
        while(i<j){
            int max=0;
            int left=heights[i];
            int right=heights[j];
            if(left<right){
                max=(left)*(j-i);
                i++;
            }
            else if(left>right){
                max=(right)*(j-i);
                j--;
            }
            else{
                max=left*(j-i);
                j--;
                i++;
            }
            res=Math.max(max,res);

        }
        return res;
    }
}
