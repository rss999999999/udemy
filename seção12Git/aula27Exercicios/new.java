public class WordPlay {
    public static boolean isVowel(char ch) {
        char lowerCase = Character.toLowerCase(ch);
        return lowerCase == 'a' || lowerCase == 'e' || lowerCase == 'i' || lowerCase == 'o' || lowerCase == 'u';
    }

    public static String replaceVowels(String phrase, char ch) {
        StringBuilder replacedPhrase = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            char currChar = phrase.charAt(i);
            if (isVowel(currChar)) {
                replacedPhrase.append(ch);
            } else {
                replacedPhrase.append(currChar);
            }
        }
        return replacedPhrase.toString();
    }

    public static String emphasize(String phrase, char ch) {
        StringBuilder emphasizedPhrase = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            char currChar = phrase.charAt(i);
            if (Character.toLowerCase(currChar) == Character.toLowerCase(ch)) {
                if (i % 2 == 0) {
                    emphasizedPhrase.append('*');
                } else {
                    emphasizedPhrase.append('+');
                }
            } else {
                emphasizedPhrase.append(currChar);
            }
        }
        return emphasizedPhrase.toString();
    }

    public static void main(String[] args) {
        // Test isVowel method
        System.out.println("isVowel('F'): " + isVowel('F')); // false
        System.out.println("isVowel('a'): " + isVowel('a')); // true

        // Test replaceVowels method
        System.out.println("replaceVowels('Hello World', '*'): " + replaceVowels("Hello World", '*')); // H*ll* W*rld

        // Test emphasize method
        System.out.println("emphasize('dna ctgaaactga', 'a'): " + emphasize("dna ctgaaactga", 'a')); // dn* ctg+*+ctg+
        System.out.println("emphasize('Mary Bella Abracadabra', 'a'): " + emphasize("Mary Bella Abracadabra", 'a')); // M+ry Bell+ +br*c*d*br+
    }
}
