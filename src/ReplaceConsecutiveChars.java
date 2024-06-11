public class ReplaceConsecutiveChars {
    public static void main(String[] args) {
        String input = "abcccbad";
        String output = replaceConsecutiveChars(input);
        System.out.println("输入: " + input);
        System.out.println("输出: " + output);
    }

    public static String replaceConsecutiveChars(String input) {
        StringBuilder result = new StringBuilder();
        char prevChar = '\0';

        for (char currentChar : input.toCharArray()) {
            if (currentChar == prevChar) {
                continue;
            }

            result.append(currentChar);
            prevChar = currentChar;
        }

        return result.toString();
    }
}
