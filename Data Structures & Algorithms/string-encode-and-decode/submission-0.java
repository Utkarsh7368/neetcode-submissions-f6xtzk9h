class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        // int n=strs.length();
        // sb.append(n);
        // sb.append('#');
        for(String s : strs){
            for(char c : s.toCharArray()){
                int strnum=(int)c;
                sb.append(strnum);
                sb.append('/');
            }
            sb.append('#');
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        StringBuilder cb=new StringBuilder();
        for(char c:str.toCharArray()){
            if(c=='#'){
                res.add(sb.toString());
                sb=new StringBuilder();
                continue;
            }
            else if(c=='/'){
                int num=Integer.parseInt(cb.toString());
                char s=(char)num;
                sb.append(s);
                cb=new StringBuilder();
                continue;
            }
            cb.append(c);
            
        }
        return res;
    }
}
