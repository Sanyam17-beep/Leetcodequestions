class Solution {
    public int[] findArray(int[] pref) {
        int ans[]=new int[pref.length];
        int xor=pref[0];
        ans[0]=xor;
        int xor1=xor;
        for(int i=1;i<pref.length;i++){
            xor1=xor^pref[i];
            ans[i]=xor1;
            xor=xor^xor1;
        }
        return ans;
    }
}