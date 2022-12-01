class Solution {
    public boolean halvesAreAlike(String s) {
        String str=s.substring(0,(s.length()/2)).toLowerCase();
        String str1=s.substring((s.length()/2),s.length()).toLowerCase();
       
      int v=0,v1=0,c=0,c1=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')             {
            v++;    
            }
            else{
                c++;
            }
        }
         for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u')             {
            v1++;    
            }
            else{
                c1++;
            }
        }
        if(v==v1&&c==c1)
        return true;
        return false;
    }
}