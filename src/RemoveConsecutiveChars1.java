public class RemoveConsecutiveChars1 {
    public static void main(String[] args) {
        String input = "aabbcccbbad";
        String output = removeConsecutiveChars(input);
        System.out.println("输入: " + input);
        System.out.println("输出: " + output);
    }

    public static String removeConsecutiveChars(String input) {
        StringBuilder result = new StringBuilder();
        int start = 0;
        int end = 0;

        while (end < input.length()) {
            while (end < input.length() && input.charAt(start) == input.charAt(end)) {
                end++;
            }

            if (end - start < 3) {
                result.append(input, start, end);
            }

            start = end;
        }

        if (result.length() < input.length()) {
            return removeConsecutiveChars(result.toString());
        } else {
            return result.toString();
        }
    }
}
