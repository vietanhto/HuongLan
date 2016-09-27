public class Solution {
    public char findTheDifference(String s, String t) {
        
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (!counts.containsKey(c)) {
                counts.put(c, 1);
                //c - 'a'
                //a -> a - a = 0
                //b -> b - a = 1
                //ascii
            } else {
                int count = counts.get(c);
                counts.put(c, count+1);
            }
        }
        
        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            if (!counts.containsKey(c)) {
                return c;
            } else {
                int count = counts.get(c);
                count--;
                if (count < 0) {
                    return c;
                } else {
                    counts.put(c, count);
                }
            }
        }
        return 'a';
    }
}
