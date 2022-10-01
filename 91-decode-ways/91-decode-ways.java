class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
       return  numDecodings(s,0,dp);
    }
    public int numDecodings(String s,int idx,int []dp){
        if(idx==s.length()){
            return dp[idx]=1;
        }
        if (dp[idx] != -1)
            return dp[idx];
        char ch=s.charAt(idx);
            int sum=numDecodings(s,idx+1,dp);
        if (s.charAt(idx) == '0') {
            return dp[idx]=0;
        }
       if (idx < s.length() - 1) {
            int num = (s.charAt(idx) - '0') * 10 + (s.charAt(idx + 1) - '0');
            if (num <= 26)
                sum += numDecodings(s, idx + 2,dp);
        }
        return dp[idx]=sum;
    }
}