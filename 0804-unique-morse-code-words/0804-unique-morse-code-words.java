class Solution {
    public int uniqueMorseRepresentations(String[] words) {
             String[] morseCode = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        // used Set because it takes only the unique elements as the input.
        Set<String> uniqueMorse = new HashSet<>();

        for (String word : words) {
            StringBuilder morseRepresentation = new StringBuilder();
            for (char c : word.toCharArray()) {
                morseRepresentation.append(morseCode[c - 'a']);
            }
            uniqueMorse.add(morseRepresentation.toString());
        }

        return uniqueMorse.size();
    }
}