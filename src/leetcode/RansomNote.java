package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for(char s : magazine.toCharArray()) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for(char s : ransomNote.toCharArray()) {
            if (!map.containsKey(s) || map.get(s) == 0) {
                return false;
            }
            map.put(s, map.get(s) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
