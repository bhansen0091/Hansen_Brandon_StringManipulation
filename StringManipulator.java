/**
 * StringManipulator
 */
public class StringManipulator {

    public String trimAndConcat(String str1, String str2) {
        return (str1.trim() + str2.trim());
    }

    public Integer getIndexOrNull(String str, char character) {

        if (str.indexOf(character) != -1) {
            return str.indexOf(character);
        }
        return null;
    }

    public Integer getIndexOrNull(String str1, String str2) {
        
        if (str1.indexOf(str2) != -1) {
            return str1.indexOf(str2);
        }
        return null;
    }

    public String concatSubString(String str1, int start, int end, String str2) {
        
        return (str1.substring(start, end) + str2);
    }
}