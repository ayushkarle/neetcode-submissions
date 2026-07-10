

class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0)
            return 0;

        int finalAns = 1;

        for (int start = 0; start < s.length(); start++) {

            HashSet<Character> set = new HashSet<>();

            for (int end = start; end < s.length(); end++) {

                if (set.contains(s.charAt(end))) {
                    break;
                }

                set.add(s.charAt(end));
                finalAns = Math.max(finalAns, set.size());
            }
        }

        return finalAns;
    }
}