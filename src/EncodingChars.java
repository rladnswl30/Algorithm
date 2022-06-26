public class EncodingChars {
    public static void main(String[] args) {
        System.out.println(encode("aabbcc"));
    }

    public static String encode(String input) {
        // check for null input
        if (input == null || input.length() == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        char[] inputChars = input.toCharArray();
        char prevChar = 0;
        int counter = 0;

        // iterate over input
        for (char c : inputChars) {
            if (c == prevChar) {
                counter++;
            } else {
                if (prevChar != 0) {
                    sb.append(counter).append(prevChar);
                }
                prevChar = c;
                counter = 1;
            }
        }

        sb.append(counter).append(prevChar);
        return sb.toString();
    }
}
