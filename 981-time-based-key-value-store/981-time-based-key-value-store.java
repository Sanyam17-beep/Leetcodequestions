class Pair{
    int time;
    String value;
    Pair(int time, String value) { this.time = time; this.value = value; }
}
class TimeMap {
    HashMap<String, List<Pair>> mp = new HashMap();
    public TimeMap() {  }
    
    public void set(String key, String value, int timeStamp) {
        if (mp.get(key) == null) mp.put(key, new ArrayList<Pair>());
        List<Pair> list = mp.get(key);
        list.add(new Pair(timeStamp, value));
    }
    
    public String get(String key, int targetTime) 
    {
        List<Pair> list = mp.get(key);
        if (list == null) return "";
        int low = 0, high = list.size() - 1;
        String ans = "";
        while(low <= high)
        {
            int mid  = low + (high - low) / 2;
            if (list.get(mid).time == targetTime) return list.get(mid).value;
            else if (list.get(mid).time < targetTime) { ans = list.get(mid).value; low = mid + 1; }
            else high = mid - 1;
        }
        return ans;
    }
}
/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */