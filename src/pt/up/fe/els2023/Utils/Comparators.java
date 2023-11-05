package pt.up.fe.els2023.Utils;

import java.util.Comparator;
import java.util.Map;

public class Comparators {
    public static Comparator<Map<?, ?>> TIME_PERCENTAGE = (map1, map2) -> {
        if (map1.get("time%") instanceof Double && map2.get("time%") instanceof Double) {
            return ((Double) map1.get("time%")).compareTo((Double) map2.get("time%"));
        }
        return 0;
    };
}
