public class ProblemSet7 {
    public static void main(String[] args) {
    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */
    public String surroundMe(String in, String out) {
        if (in != null && out != null && out.length() == 4 ) {
            String temp = out.substring(0,2);
            String temp2 = out.substring(2);
            String output = temp + in + temp2;
            return output;
        }
        else {
            return in;
        }
    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text (overlapping, as needed).
     */
    public String endsMeet(String text, int n) {
        if (text != null && text.length() <= 10 && text.length() >= 1 && n <= text.length()
        && n > 0) {
            String result = text.substring(0, n) + text.substring(text.length() - n);
            return result;
        }
        return text;
    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */
    public String middleMan(String text) {
        if (text != null && text.length() % 2 == 1 && text.length() >= 3) {
            int start = text.length() / 2 - 1;
            String out = text.substring(start, start + 3);
            return out;
        }
        return text;
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    public boolean isCentered(String text, String target) {
        if (text != null && text.length() % 2 == 1 && text.length() > 3 && target.length() == 3
        && target != null) {
            int start = text.length() / 2 - 1;
            String mid = text.substring(start, start + 3);
            if (target.equals(mid)) {
                return true;
            }
        }
        return false;
    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */
    public int countMe(String text, char suffix) {
        if ((int) Character.toUpperCase(suffix) >= 65 && (int) Character.toUpperCase(suffix) <= 132
        && text != null) {
            String words[] = text.split(" ");
            int count = 0;
            for (String word : words) {
                if (word.substring(word.length() - 1).equals(String.valueOf(suffix))) {
                    count++;
                }
            }
            return count;
        }
        return -1;
    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */
    public int triplets(String text) {
        if (text != null) {
            int count = 0;
            for (int i = 0; i < text.length() - 2; i++) {
                if (text.charAt(i) == text.charAt(i + 1)
                        && text.charAt(i) == text.charAt(i + 2)) {
                    count++;
                }
            }
            return count;
        }
        return -1;
    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */
    public long addMe(String text) {
        if (text != null) {
            int sum = 0;
            char[] chars = text.toCharArray();
            for (char c : chars) {
                if ((int) c >= 49 && (int) c <= 57) {
                    sum += Integer.parseInt(String.valueOf(c));
                }
            }
            return sum;
        }
        return -1;
    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */
    public long sequence(String text) {
        if (text != null) {
            int count = 0;
            int highest = 0;
            for (int i = 0; i < text.length() - 1; i++) {
                if (text.charAt(i) == text.charAt(i + 1)) {
                    if (count == 0) {
                        count++;
                    }
                    count++;
                }
                else {
                    count = 1;
                }
                if (highest < count) {
                    highest = count;
                }
            }
            if (text.length() == 1){
                highest = 1;
            }
            return highest;
        }
        return -1;
    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    public String intertwine(String a, String b) {
        if (a != null && b != null) {
            String result = "";
            final int largest = (a.length() >= b.length()) ? a.length(): b.length();
            for (int i = 0; i < largest; i ++) {
                try {
                    result += String.valueOf(a.charAt(i)) + String.valueOf(b.charAt(i));
                }
                catch (Exception e) {
                    if (b.length() > a.length()) {
                        result += b.substring(i);
                        break;
                    }
                    else if (b.length() < a.length()) {
                        result += a.substring(i);
                        break;
                    }
                }
            }
            return result;
        }
        return null;
    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */
    public boolean isPalindrome(String text) {
        if (text == null || text == "") {
            return false;
        }
        for (int i = 0; i < text.length()/2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
