class Solution {
    public boolean isValid(String s) {
        Stack<Character> a=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!a.isEmpty()&&(a.peek()==c-1 ||a.peek()==c-2))a.pop();
            else a.push(c);
        }
        if(a.isEmpty())return true;
        else return false;
    }
}
