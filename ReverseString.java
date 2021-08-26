public class ReverseString {
    static String reverseInParentheses(String inputString) {

        if(inputString.contains("(")){
            int first=inputString.lastIndexOf("(");
            int last=inputString.indexOf(")", first);

            String min= inputString.substring(first+1, last);
            String minrev="";
            char[] s = min.toCharArray();
            if (s.length <= 0) {
                inputString=inputString.replace("("+min+")", "");

            }
            for(int i=s.length-1; i>=0; i--){
                minrev+=s[i];
            }
            inputString=inputString.replace("("+min+")", minrev);
            inputString=reverseInParentheses(inputString);

        }
        return inputString;

    }

    public static void main(String[] args) {
        System.out.println("Reversed string is: "+reverseInParentheses("foo(bar(baz))blim"));
        
    }

}
