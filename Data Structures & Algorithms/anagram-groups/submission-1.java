class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<HashMap<Character, Integer>, List<String>> result = new HashMap<>();

        for(String word : strs) {
            HashMap<Character, Integer> freqMap = new HashMap<>();

            for(Character c : word.toCharArray()) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }

            result.putIfAbsent(freqMap, new ArrayList<>());

            result.get(freqMap).add(word);
        }
        return new ArrayList<>(result.values());
    }
}
