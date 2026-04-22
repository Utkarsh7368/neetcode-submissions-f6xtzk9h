class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb=new StringBuilder();
        int res=0;
        for(int i=0;i<s.length();i++){
            sb=new StringBuilder();
            sb.append(s.charAt(i));
            for(int j=i+1;j<s.length();j++){
                if(sb.toString().indexOf(s.charAt(j))==-1){
                    sb.append(s.charAt(j));
                }
                else{
                res=Math.max(sb.length(),res);
                break;
                }
            }
            res=Math.max(sb.length(),res);
        }
        if(s.length()==1){
            res=1;
        }
        return res;
    }
}
