import java.util.HashMap;
import java.util.Map.Entry;

public class OddOccurrence {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 5};

        System.out.println(solution(nums));
        
    }
    public static int solution(int[] A) {
        HashMap<Integer, Integer> nums = new HashMap<Integer, Integer>();
        int N= A.length;
        int result = 0;
        if(N%2!=1 || N<1 || N>1000000000){
            return 0;

        }
        for(int i=0; i<N; i++){
            if(A[i]<1 || A[i]>1000000000){
                return 0;

            }
            if(nums.containsKey(A[i])){
                nums.remove(A[i]);
                nums.put(A[i], 2);

            }
            else{
                nums.put(A[i], 1);
            }


        }
        for (Entry<Integer, Integer> entry : nums.entrySet()) {
            if (entry.getValue().equals(1)) {
                result = entry.getKey();
            }
        }
        return result;

    }
}
