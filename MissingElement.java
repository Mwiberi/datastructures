import java.util.Arrays;

public class MissingElement {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 3, 6 };

        System.out.println(solution(nums));

    }

    public static int solution(int[] A) {
        // write your code in Java SE 8

        int size = A.length;
        int count = 1;

        Arrays.sort(A);

        for (int i = 0; i < size; i++) {
            if (A[i] != count)
                return count;
            count++;
        }
        return count;

    }

}
