public class StringManipulator {
    public String trimAndConcat(String A, String B ) {
        // Trim the two strings first
        A = A.trim();
        B = B.trim();

        String newString = A + B;
        

        return newString;
    }
    public Integer getIndexOrNull(String A, char B ) {
        // Trim the two strings first
        System.out.println(A.indexOf(B));

        Integer indexString = A.indexOf(B);
        

        return indexString;
    }
    public Integer getIndexOrNull(String A, String B ) {
        // Trim the two strings first
        System.out.println(A.indexOf(B));

        Integer indexString = A.indexOf(B); 
        

        return indexString;
    }
}
