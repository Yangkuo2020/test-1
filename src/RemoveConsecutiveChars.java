public class RemoveConsecutiveChars {
        public static void main(String[] args) {
            String input = "aabbccdddddee";
            // 输入字符串
            String output = removeConsecutiveChars(input);
            System.out.println("输出结果: " + output);
        }

        public static String removeConsecutiveChars(String input) {
            StringBuilder sb = new StringBuilder(input);

            boolean hasReplacements = true;
            while (hasReplacements) {
                hasReplacements = false;
                int count = 1;
                for (int i = 1; i < sb.length(); i++) {
                    if (sb.charAt(i) == sb.charAt(i - 1)) {
                        count++;
                    } else {
                        if (count >= 3) {
                            sb.delete(i - count, i);
                            hasReplacements = true;
                            break;
                        }
                        count = 1;
                    }
                }
                if (count >= 3) {
                    sb.delete(sb.length() - count, sb.length());
                    hasReplacements = true;
                }
            }

            return sb.toString();
        }
    }




