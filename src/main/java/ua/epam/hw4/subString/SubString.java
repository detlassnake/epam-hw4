package ua.epam.hw4.subString;

public class SubString {
    public String commonSubString(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return commonSubString(str2, str1);
        }
        String subStr = "";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = str1.length() - i; j > 0; j--) {
                for (int k = 0; k < str2.length() - j; k++) {
                    if (str1.regionMatches(i, str2, k, j) && j > subStr.length()) {
                        subStr = str1.substring(i, i + j);
                    }
                }
            }
        }
        return subStr;
    }
}