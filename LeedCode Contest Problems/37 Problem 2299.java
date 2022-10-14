class Solution {
    public boolean strongPasswordCheckerII(String p) {
        if(p.length()<8)return false;
        int lc=0,uc=0,dc=0,sc=0;
        for(int i=0;i<p.length();i++){
            char c=p.charAt(i);
            if(i!=p.length()-1&&c==p.charAt(i+1))return false;
            if(Character.isLowerCase(c))lc++;
            if(Character.isUpperCase(c))uc++;
            if(Character.isDigit(c))dc++;
            if(c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*'||c=='('||c==')'||c=='-'||c=='+')sc++;
        }
        if(lc>0&&uc>0&&dc>0&&sc>0)return true;
        return false;
    }
}
