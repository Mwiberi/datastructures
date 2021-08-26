// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class safaricom_2021_May {
    public int solution(String S) {
        // write your code in Java SE 8

        // extract operations
        // int spaces = S.length() - S.replaceAll(" ", ""). length();
        // int[] operations = new int[spaces+1];

        String[] operations = S.split(" ");

        List<Integer> data = new ArrayList<Integer>();
        for(int i=0; i<operations.length; i++){
            switch(operations[i]) {
                case "POP":
                    if(data.size()<1){
                        return -1;
                    }
                    else{
                        data.remove(data.size() - 1);
                    }
                    break;

                case "DUP":
                    if(data.size()<1){
                        return -1;
                    }
                    else{
                        int last_item = data.get(data.size() - 1);
                        data.add(last_item);
                    }
                    break;
                case "-":
                    if(data.size()<2){
                        return -1;
                    }
                    int last = data.get(data.size() - 1);
                    int second_last = data.get(data.size() - 2);
                    if(last - second_last<0){
                        return -1;
                    }
                    data.remove(data.size() - 1);
                    data.remove(data.size() - 1);

                    data.add(last - second_last);
                    
                    break;
                case "+":
                    if(data.size()<2){
                        return -1;
                    }
                    int last_item = data.get(data.size() - 1);
                    int second_last_item = data.get(data.size() - 2);
                    data.remove(data.size() - 1);
                    data.remove(data.size() - 1);
                    data.add(last_item + second_last_item);
                    break;
                default:
                    data.add(Integer.parseInt(operations[i]));
            }

        }

        return data.get(data.size() - 1);
    }
}
