import java.util.HashMap;

public class MakeChange {

    public static int[] makeChange(int value, int[] coinValues) {
        HashMap<Integer, int[]> map = new HashMap<Integer, int[]>();
        return makeChangeHelper(value, coinValues, map);
    }

    public static int[] makeChangeHelper(int value, int[] coinValues, HashMap<Integer, int[]> map) {
        if (map.containsKey(value)) return map.get(value);
        
        if (value == 0) return new int[coinValues.length];
        
        if (value < 0) return null;
        
        int minCoins = Integer.MAX_VALUE;
        int[] minResult = null;
        for (int coinIdx = 0; coinIdx < coinValues.length; coinIdx++) {
            int coinValue = coinValues[coinIdx];

            int[] result = makeChangeHelper(value - coinValue, coinValues, map);

            if (result != null) {
                int nCoins = sumArray(result);
                if (nCoins < minCoins) {
                    minResult = result.clone();
                    minResult[coinIdx]++;
                    minCoins = nCoins;
                }
            }
        }

        map.put(value, minResult);

        return minResult;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int value : array)
            sum += value;
        return sum;
    }

    public static void main(String[] args) {
        int value = Integer.parseInt(args[0]);
        int[] coinValues = new int[args.length - 1];
        for (int i = 0; i < coinValues.length; i++)
            coinValues[i] = Integer.parseInt(args[i+1]);

        int[] change = makeChange(value, coinValues);
        System.out.println("Best way to make change for " + value + " is: ");
        for (int i = 0; i < coinValues.length; i++) {
            System.out.println(coinValues[i] + ": " + change[i]);
        }
    }

}
