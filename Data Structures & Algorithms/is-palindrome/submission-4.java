class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        System.out.println(sb.toString());
        int n=sb.length();
        String str=sb.toString();
        for(int i=0;i<n/2;i++){
           if(str.charAt(i) !=str.charAt(n - i - 1)){
    return false;
}
        }
    return true;
    }
}
