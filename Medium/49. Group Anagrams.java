class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> returnList = new ArrayList<>();
        Map<String, Map<Character, Integer>> apotelesmata = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            boolean trueorfalse = false;
            Map<Character, Integer> lettersCounting = new HashMap<>();
            for (char c : strs[i].toCharArray()) {
                if (Character.isLetter(c)) {
                    c = Character.toLowerCase(c);
                    lettersCounting.put(c, lettersCounting.getOrDefault(c, 0) + 1);
                }
            }
            if (apotelesmata.containsValue(lettersCounting)) {
                for (int a = 0; a < returnList.size(); a++) {
                    String key = returnList.get(a).get(0);
                    if (lettersCounting.equals(apotelesmata.get(key))) {
                        returnList.get(a).add(strs[i]);
                        trueorfalse = true;
                        break;
                    }
                }
            }
            apotelesmata.put(strs[i], lettersCounting);

            if (!trueorfalse) {
                returnList.add(new ArrayList<String>(Arrays.asList(strs[i])));
            }
        }
        return returnList;
    }
}
