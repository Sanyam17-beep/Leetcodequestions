class Solution {
    public String reverseWords(String s) {
        String str[]= s.trim().split(" ");
        String ans="";
        for(int i=str.length-1;i>=0;i--){
            String temp=str[i].trim();
            if(temp=="")continue;
           ans+=(temp+" ");
        }
        return ans.trim();
    }
}