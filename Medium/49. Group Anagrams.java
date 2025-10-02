class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> returnList = new ArrayList<>();
        List<String> newListForFirstString = new ArrayList<>();
        newListForFirstString.add(strs[0]);
        returnList.add(newListForFirstString);
        Map<String,Map<Character,Integer>> apotelesmata=new HashMap<>();
        Map<Character, Integer> m3 = new HashMap<>();
            for (char c : strs[0].toCharArray()) {
                if (Character.isLetter(c)) {
                    c = Character.toLowerCase(c);
                    m3.put(c, m3.getOrDefault(c, 0) + 1);
                }
            }
        apotelesmata.put(strs[0],m3);
        for (int i = 1; i < strs.length; i++) {
            boolean trueorfalse=false;
            Map<Character, Integer> m = new HashMap<>();
            for (char c : strs[i].toCharArray()) {
                if (Character.isLetter(c)) {
                    c = Character.toLowerCase(c);
                    m.put(c, m.getOrDefault(c, 0) + 1);
                }
            }
            for (int a = 0; a < returnList.size(); a++) {
                    String key= returnList.get(a).get(0);
                     Map<Character, Integer> m2 = apotelesmata.get(key);
                    if(m.equals(m2)){
                        returnList.get(a).add(strs[i]);
                        trueorfalse=true;
                        break;
                    }
            }
            apotelesmata.put(strs[i],m);
        
            if(!trueorfalse){
                List<String> newListForFirstString2 = new ArrayList<>();
                newListForFirstString2.add(strs[i]);
                returnList.add(newListForFirstString2);
            }
        }
        return returnList;
    }
}
