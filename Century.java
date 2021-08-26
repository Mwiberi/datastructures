import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Century {
    public static int getCentury(int year) {

        int century = year / 100;
        int remainder = year % 100;
        if (remainder > 0) {
            return century + 1;
        } else {
            return century;
        }

    }

    public static boolean isPalindrome(String name) {
        String reversed = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversed += name.charAt(i);
        }
        if (reversed.equals(name)) {
            return true;

        }
        return false;

    }

    public static int adjacentElementsProduct(int[] inputArray) {
        if (inputArray.length < 1) {
            return 0;
        }
        if (inputArray.length == 1) {
            return inputArray[0];
        }

        int temp = inputArray[0] * inputArray[1];
        for (int i = 1; i < inputArray.length - 1; i++) {
            int product = inputArray[i] * inputArray[i + 1];
            if (product > temp) {
                temp = product;
            }
        }
        return temp;
    }

    public static int shapeArea(int n) {

        if (n == 1) {
            return 1;
        } else {
            return ((n - 1) * 4) + shapeArea(n - 1);
        }
    }

    public static int makeArrayConsecutive(int[] statues) {
        // Arrays.sort(statues);

        // int temp = 0;
        // if(statues.length<2){
        // return 0;
        // }
        // Set<Integer> set = new HashSet<>();
        // for(int i: statues){
        // set.add(i);

        // }
        // for(int i=statues[0]; i<statues[statues.length-1]; i++){
        // if(!set.contains(i)){
        // temp+=1;

        // }

        // }

        // return temp;

        Arrays.sort(statues);
        int expected_length = statues[statues.length - 1] - statues[0] + 1;
        int actual_length = statues.length;

        return expected_length - actual_length;

    }

    public static boolean almostIncreasingSequence(int[] sequence) {
        int len = sequence.length;

        if (len == 1) {
            return true;

        }
        int count = 0;

        for (int i = 0; i < len - 1; i++) {
            if (sequence[i] >= sequence[i + 1]) {
                count++;
                if (i > 0 && (i + 2) < len && sequence[i - 1] >= sequence[i + 1] && sequence[i] >= sequence[i + 2]) {
                    count++;

                }

            }

        }

        return count > 1 ? false : true;

    }

    public static void main(String[] args) {
        // System.out.println(getCentury(101));
        // System.out.println(isPalindrome("abba"));
        int[] data = { 1, 7, 3 };
        // System.out.println(adjacentElementsProduct(data));

        // System.out.println(shapeArea(5));
        System.out.println(makeArrayConsecutive(data));
    }

}
