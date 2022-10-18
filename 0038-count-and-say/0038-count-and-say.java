class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s = countAndSay(n-1);
        StringBuilder res = new StringBuilder();
        int i=0, l=s.length(), cnt;
        while(i<l) {
            cnt = 1;
            while(i+1<l && s.charAt(i)==s.charAt(i+1)){
                cnt++; i++;
            }
            res.append(cnt);
            res.append(s.charAt(i));
            i++;
        }
        return res.toString();
    }
}