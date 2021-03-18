import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class MapSample {
    public static void main(String[] args) {
        final int MAX_ITERATION = 1000000;
        Map<Integer, String> map = new HashMap<>();
        //Map<Integer, String> map = new TreeMap<>();

        long begin = System.currentTimeMillis();
        System.out.println("Processing "+ MAX_ITERATION + " times");
        /*
        map.put(9, "Red");
        map.put(12, "Black");
        map.put(6, "Green");
        map.put(19, "White");*/

        for (int i=0; i < MAX_ITERATION; i++){
            map.put(i,"Number "+ i);
        }

        long put = System.currentTimeMillis();
        System.out.println("Tempo put (ms): " + (put - begin));

        for (Map.Entry<Integer, String> value: map.entrySet()) {
            //System.out.println(value);
        }

        long get = System.currentTimeMillis();
        System.out.println("Tempo get all (ms): " + (get - put));

        for (int i=0; i < MAX_ITERATION; i++){
            int random = (int)(Math.random() * MAX_ITERATION);
            map.get(random);
        }

        long random = System.currentTimeMillis();
        System.out.println("Tempo get random (ms): " + (random - get));
    }
}
