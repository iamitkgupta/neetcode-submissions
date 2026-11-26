class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> lis = new ArrayList<>();

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++) {
            lis.add(Character.valueOf(s.charAt(i)));
        }

        for(int i = 0; i < t.length(); i++) {
            if(lis.contains(Character.valueOf(t.charAt(i)))) {
                lis.remove(Character.valueOf(t.charAt(i)));
            }
            else {
                return false;
            }
        }

        return true;
    }
}
