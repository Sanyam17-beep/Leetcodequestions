class Solution {
    public int minCost(String colors, int[] nee) {
        int ans=0;
        for(int i=0;i<colors.length()-1;i++){
            if(colors.charAt(i)==colors.charAt(i+1)){
                ans+=Math.min(nee[i],nee[i+1]);
                nee[i+1]=Math.max(nee[i],nee[i+1]);
            }
        }
        return ans;
    }
}