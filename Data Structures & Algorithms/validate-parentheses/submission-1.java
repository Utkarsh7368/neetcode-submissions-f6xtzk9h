class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty()){
            char b=stack.peek();
            if(c==')' && b=='(' || c=='}' && b=='{' || c==']' && b=='['){
                stack.pop();
            }
            else {
                stack.push(c);
            }
            }else{
                stack.push(c);
            }
           
        }
         return stack.isEmpty();
    }
}
