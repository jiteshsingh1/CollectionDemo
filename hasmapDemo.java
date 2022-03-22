import java.util.HashMap;
import java.util.Map;

public class hasmapDemo {
    public static void main(String[] args) {

        // creat has map first
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // we can add in hasmap by using "put" method.
        // hasmap works on key value pair.
        hm.put("gurgaon", 1);
        hm.put("delhi", 2);
        hm.put("agra", 3);
        hm.put("ambala", 4);
        hm.put("rohtak", 5);
        hm.put("dwarka", 6);
        hm.put("mumbai", 7);
        hm.put("manali", 8);
        hm.put("shimla", 9);

        // size method to print size of map.
        System.out.println("the size of map is" + " " + hm.size());

        // if can check any value or key by using contains method
        // we can use get method store value.
        if (hm.containsKey("delhi")) {
            Integer value = hm.get("delhi");
            System.out.println("the value of delhi is" + " " + value);
        }
        ;
        // hasmap is unordered.
        for (Map.Entry<String, Integer> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        // we can replace value of an specified key.
        // similerly we can use "remove" method to remove entry of an specified key
        hm.replace("delhi", 20);
        System.out.println(hm);

        // we can print keyset using "keyset" method
        // and values too using "values" method
        System.out.println(hm.keySet());
        System.out.println(hm.values());
    }

}
