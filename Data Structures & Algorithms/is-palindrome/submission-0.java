class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int last = s.length() - 1;

        while(start <= last){
            if(s.charAt(start)!=s.charAt(last)){
                return false;
            }
            start++;
            last--;
        }
        return true;
    }
}