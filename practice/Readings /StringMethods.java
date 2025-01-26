public class StringMethods{

    public static void main(String [] args){
        System.out.println(endsWithRep("Adarsh", "ad", 5));
        System.out.println(endsWithRep("foobarbar", "bar", 2));
        System.out.println(endsWithRep("foobarbar", "baz", 1));
        System.out.println(endsWithRep("Adarshshsh", "sh", 3));
    }

    public static boolean endsWithRep(String s1, String s2, int n){
        
        String checker = "";
        for (int i = 0; i < n; i++){
            checker = checker.concat(s2);
            // System.out.println("test");
        }
        // System.out.println(checker);
        return s1.endsWith(checker);
    }
}