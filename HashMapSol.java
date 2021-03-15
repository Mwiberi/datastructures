
import java.util.HashMap;
public class HashMapSol{

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        
        hashmap.put("Carol", "Puppy12");
        hashmap.put("Wangechi", "P@aaW0rd");
        hashmap.put("Mwiberi", "BabySh@rk");

        //hashmap.replace("Carol", "SharkDoodooDoo");
        System.out.println(hashmap);

        for(String i :hashmap.keySet()){
            //System.out.println("Name: " + i + " Password: " + hashmap.get(i));

        }

        //hashmap.remove("Mwiberi");
        //System.out.println(hashmap);

        System.out.println(hashmap.containsKey("Mwiberi"));

        System.out.println(hashmap.containsValue("Mwiberi"));
        

    }
}