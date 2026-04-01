class Solution {
    public boolean isAnagram(String s, String t) {
     if(s.length()!=t.length()){
        return false;
     }
     boolean res=true;
    int[] freq=new int[26];
    for(char c : s.toCharArray()){
        freq[c-'a']++;
    }
    for(char r : t.toCharArray()){
        freq[r-'a']--;
        if(freq[r-'a']<0){
            return false;
        }
    }
    
   
    return true;
    }
}
