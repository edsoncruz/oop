import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapColorObject {
    public static void main(String[] args) {
        Map<Integer, Color> colors = new HashMap<>();

        Color red = new Color("Red", "255-0-0");
        Color black = new Color("Black", "0-0-0");
        Color green = new Color("Green", "0-255-0");
        Color white = new Color("White", "255-255-255");

        colors.put(9, red);
        colors.put(12, black);
        colors.put(6, green);
        colors.put(19, white);

        for (Map.Entry<Integer,Color> value: colors.entrySet()) {
            System.out.println(value);
        }
    }
}
