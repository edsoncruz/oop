import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapColor {
    public static void main(String[] args) {
        TreeMap<Integer, String> colors = new TreeMap<>();

        colors.put(9, "Red");
        colors.put(12, "Black");
        colors.put(6, "Green");
        colors.put(19, "White");

        for (Map.Entry<Integer,String> value: colors.entrySet()) {
            System.out.println(value);
        }
    }
}