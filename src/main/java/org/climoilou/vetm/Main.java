package org.climoilou.vetm;

public class Main {
    public static String cesarCipher(String message, int offset) {
        StringBuilder result = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    public static String cesarDecipher(String message, int offset) {
        return cesarCipher(message, 26 - (offset % 26));
    }

    public static void main(String[] args) {
        System.out.println(cesarCipher("bonjour", 1));
    }
}