package String;

public class Amaliyot_1 {
    public static void main(String[] args) {
        String testString = "abcabcdefg";
        engKopBolaklar(testString);
    }

    public static void engKopBolaklar(String str) {
        if (str.length() <= 1) {
            System.out.println("Boshqa variantlar bormi?");
            return;
        }

        String maxSubstring = " ";
        String currentSubstring = String.valueOf(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar >= currentSubstring.charAt(currentSubstring.length() - 1)) {
                currentSubstring += currentChar;
            } else {
                if (currentSubstring.length() > maxSubstring.length()) {
                    maxSubstring = currentSubstring;
                }
                currentSubstring = String.valueOf(currentChar);
            }
        }

        if (currentSubstring.length() > maxSubstring.length()) {
            maxSubstring = currentSubstring;
        }

        if (maxSubstring.length() <= 1) {
            System.out.println("Boshqa variantlar bormi?");
        } else {
            System.out.println(maxSubstring);
        }
    }
}
