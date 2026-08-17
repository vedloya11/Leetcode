class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int j = 0;
        int output = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
            while (map.get(s.charAt(i)) > 2) {
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                j++;

            }
            output = Math.max(output,(i - j + 1));
        }
        return output;

    }
}