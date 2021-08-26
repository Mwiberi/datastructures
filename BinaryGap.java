public class BinaryGap {
    public static int sol(int N) {
        String binary = Integer.toBinaryString(N);
        System.out.println("The binary"+binary);
        if(binary.length()<3){
            return 0;
        }
        
        int temp = 0;
        for(int i=binary.indexOf("1"); i<binary.length(); i++){
            System.out.println(i);
            int first  = i;
            int next = binary.indexOf("1", first+1);
            if(next!=-1){
                
                int gap =next-first-1;
                System.out.println(i+" to " + next+" is "+gap);
                if(gap>temp){
                    temp = gap;
                }
                i=next-1;
            }
                
            else{
                break;
            }

            
            
            

        }
        
        return temp;
    }
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int N = A.length;

        if(N==K){
            return A;
        }
        if(K==0){
            return A;
        }
        int[] B = new int[N];
        int no_of_times = K%N;
        for(int i=0; i<N; i++){
            int temp = i+no_of_times-1;
            B[i]=A[temp%N];

        } 

        return B;
    }
    public static void main(String[] args) {
        System.out.println("The answers "+sol(1041));
        
    }
        
    }
    

