import java.util.Arrays;

public class ArrayRotation {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println(Arrays.toString(solution(nums, 4)));
        
    }
    public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8

        if(K<0 || K>100){
            throw new IllegalArgumentException();

        }

        int len =A.length;
        if(len<1 || len>100){
            throw new IllegalArgumentException();

        }
        int start = len-K;
        int[] result = new int[len];

        int count = 0;
         
        for(int i=start; i<len; i++){
            
               result[count] =A[i];
               count++;
        }
        for(int i=0; i<start; i++){
            result[count] =A[i];
               count++;
 
         }
        return result;
    }
}