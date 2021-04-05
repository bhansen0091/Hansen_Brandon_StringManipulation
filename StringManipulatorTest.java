/**
 * StringManipulatorTest
 */
public class StringManipulatorTest {

    public static void main(String[] args) {
        StringManipulator result = new StringManipulator();

        System.out.println(result.trimAndConcat("     Hello     ", "       World       "));

        System.out.println(result.getIndexOrNull("This is a String!!", 'T'));
        
        System.out.println(result.getIndexOrNull("This is another String!!", "Srting"));
        
        System.out.println(result.concatSubString(";lmfklms", 1, 5, "something"));
        System.out.println(result.concatSubString("", 0, 0, "something"));
    }
}