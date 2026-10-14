class Solution {
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }
    public void reverse(char[] s,int st,int end){
        if(st>=end){
            return;
        }
        char temp=s[st];
        s[st]=s[end];
        s[end]=temp;
        reverse(s,st+1,end-1);
    }
}