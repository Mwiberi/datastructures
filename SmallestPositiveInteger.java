import java.util.Arrays;

public class SmallestPositiveInteger {
    public static void main(String[] args) {
        int[] nums = { -10, 1, 3, 6, 4, 1, 2 };

        System.out.println(solution(nums));

    }

    public static int solution(int[] A) {
        // write your code in Java SE 8

        int smallestInt = 1;

        if (A.length == 0)
            return smallestInt;

        Arrays.sort(A);

        if (A[0] > 1)
            return smallestInt;
        if (A[A.length - 1] <= 0)
            return smallestInt;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == smallestInt) {
                smallestInt++;
            }
        }

        return smallestInt;

    }

}
