class Solution {
    public long countPairs(int[] nums, int k) {
        int n = nums.length;
        long count = 0L;
        Map<Integer, Long> map = new HashMap<>();
        
        for(int i=0; i< n; i++){
            int gd = gcd(nums[i],k);
            int want = k/gd;
            for(int p: map.keySet()){
                if(p%want == 0){
                    count += map.get(p);
                }
            }
            map.put(gd,map.getOrDefault(gd,0L)+1L);
        }
        
        return count;
        
    }
    
    public int gcd(int a, int b){
        if(a>b){return gcd(b,a);}
        if(a==0){return b;}
        return gcd(a,b%a);
    }
}