class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> counts_s = new HashMap<>();
        HashMap<Character, Integer> counts_t = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            counts_s.put(s.charAt(i), 1 + counts_s.getOrDefault(s.charAt(i), 0));
            counts_t.put(t.charAt(i), 1 + counts_t.getOrDefault(t.charAt(i), 0));
        }

        return counts_s.equals(counts_t);

    }
}
