class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> hset = new HashSet<>();
        for (final char ch : sentence.toCharArray())
            hset.add(ch);
        return hset.size() == 26; 
    }
}