public class ImmutableString {
    public static void main(String[] args) {
        String first = "first";

        System.out.println(first.hashCode());// A hash code is an integer value that is //associated with each object in
                                             // Java
        // prints something

        first = first + "!";

        System.out.println(first.hashCode());
        // different string, different hash code
    }

}
