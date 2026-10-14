import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> charMappingMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if (!charMappingMap.containsKey(original)) {

                if (!charMappingMap.containsValue(replacement)) {
                    charMappingMap.put(original, replacement);
                } else {
                    return false;
                }

            } else {
                char mappedCharacter = charMappingMap.get(original);

                if (mappedCharacter != replacement) {
                    return false;
                }
            }
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna