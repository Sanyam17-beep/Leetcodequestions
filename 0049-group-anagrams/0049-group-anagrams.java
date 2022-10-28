class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
      List<List< String>> al = new ArrayList<>();
    int len = str.length,pos=0;        
    String[] temp = new String[len];
    boolean[] visited = new boolean[len];
    
    for(String i: str){
        char[] arr = i.toCharArray();
        Arrays.sort(arr);
        temp[pos++] = new String(arr);
    }       
    
    for(int i=0;i<len;i++){            
        if(!visited[i]){
            ArrayList< String> key = new ArrayList<>();
            for(int j=i;j<len;j++){
                if(temp[i].equals(temp[j])){
                    key.add(str[j]);
                    visited[j]=true;
                }
            }
            al.add(key);
        }            
    }    
    
    return al;
    }
}