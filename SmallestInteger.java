
import java.util.*;

class SmallestInteger {
    public static int solution(int[] A) {
        // write your code in Java SE 8

        Set<Integer> set = new HashSet<>();
        for (int i :A) {
            set.add(i);
        }
        System.out.println(set);
        
        int N = set.size();

        int index=0;
        int[] newA = new int[N];
        for (int a : set) {
            newA[index] = a;
            index++;
        }
        System.out.println(newA.toString());
        Arrays.sort(newA);
       

        if (newA[N - 1] < 1) {
            return 1;

        }
        if (newA[N - 1] - newA[0] == N - 1) {
            return A[N - 1] + 1;
        }
        
        for (int i = newA[0]; i < newA[N-1]; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 1;
    }
       public static void main(String[] args) {
           int[] A ={1, 3, 6, 4, 1, 2};
           System.out.println(solution(A));
       }

}
