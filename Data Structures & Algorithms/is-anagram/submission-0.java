class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;        }

        HashMap<Character, Integer> map = new HashMap<>();

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        for (char c : sArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : tArray) {
            if (!map.containsKey(c)) {
                return false;
            }
            int count = map.get(c);
            if (count == 1) {
                map.remove(c);
            } else {
                map.put(c, count - 1);
            }
        }

        return map.isEmpty();
    }
}

