package main;

public class StringManipulator {

    // input: ExAmPLE => output: ELPmAxE
    public static String reverse(String input) {

        char[] chars = input.toCharArray();
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    // input: example => output: false
    // input: ELpmpLE => output: true
    public boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {

            if (!Character.isLetterOrDigit(input.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(input.charAt(right))) {
                right--;
            } else {

                if (Character.toLowerCase(input.charAt(left)) != Character.toLowerCase(input.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }

    // input: ExAmPLE, part: Ex => output: true
    // input: ExAmPLE, part: ex => output: false
    public boolean isContained(String input, String part) {
        // Your code here

        return input.contains(part);
    }

    // input: ExAm1PLE2 => output: ExAmPLE
    public String numberRemoved(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetter(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }

    // input: ExAmPLE => output: EXAMPLE
    public String upperString(String input) {
        // Your code here
        return input.toUpperCase();
    }

    // input: ExAmPLE => output: example
    public String lowerString(String input) {
        // Your code here
        return input.toLowerCase();
    }

    // input: example string => output: Example String
    public String capitalString(String input) {

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {

            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return result.toString().trim();
    }

    // input: Example => output: 3
    public int countVowels(String input) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if ("aeiouAEIOU".indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }

    // input: Hello, how are you? => output: 4
    public int countWords(String sentence) {
        String[] words = sentence.split("\\s+");

        return words.length;
    }

    // Input: input = "Java programming", substring = "programming" => Output: 5
    // Input: input = "Java programming", substring = "Programming" => Output: -1
    public int findSubstringIndex(String input, String substring) {
        // Your code here
        return input.indexOf(substring);
    }

    // Input: "Hello World How Are You" => Output: "You Are How World Hello"
    public String reverseWords(String sentence) {
        String[] words = sentence.split(" ");

        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);

            if (i > 0) {
                reversedSentence.append(" ");
            }
        }

        return reversedSentence.toString();
    }
}
