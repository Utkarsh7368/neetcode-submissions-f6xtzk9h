class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1){
            return 1;
        }
        Map<Character,Integer> map=new HashMap<>();
        int l=0,r=0,res=0;
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                 res=Math.max(r-l,res);
                l = Math.max(l, map.get(s.charAt(r)) + 1);
                map.put(s.charAt(r),r);
               r++;
            }
            else{
                map.put(s.charAt(r),r);
                r++;
            }
            res=Math.max(r-l,res);
        }
        return res;
    }
}
