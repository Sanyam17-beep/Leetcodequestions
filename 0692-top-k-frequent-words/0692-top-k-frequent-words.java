class Solution {
    class pair{
        String str;
        int freq;
        pair(String str,int freq){
            this.str=str;
            this.freq=freq;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->{
            if (a.freq != b.freq) {
            return b.freq - a.freq;
        }
        return a.str.compareTo(b.str);
        });
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
                map.put(words[i],map.get(words[i])+1);
            }
            else{
               map.put(words[i],1); 
            }
        }
          for (Map.Entry entry : map.entrySet()) {
            pq.add(new pair((String)entry.getKey(),(int)entry.getValue()));
        }
        List<String>res=new ArrayList<>();
        while(k-->0){
            res.add(pq.poll().str);
        }
        return res;
    }
}