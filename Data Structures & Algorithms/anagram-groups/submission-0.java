class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        boolean[] visited=new boolean[strs.length];
       for(int i=0;i<strs.length;i++){
        if(visited[i]){
            continue;
        }
        visited[i]=true;
        List<String> ls=new ArrayList<>();
        ls.add(strs[i]);
        for(int j=i+1;j<strs.length;j++){
            if(!visited[j] && isAnagram(strs[i],strs[j])){
                ls.add(strs[j]);
                visited[j]=true;
            }
        }
        res.add(ls);
       }

    return res;
    }

    private boolean isAnagram(String s,String t){
        if (s.length() != t.length()) return false;
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
