package pt.up.fe.els2023.Utils;

import java.util.Comparator;
import java.util.Map;

public class Comparators {
    public static Comparator<Object> TIME_PERCENTAGE = (o1, o2) -> {
        if (!(o1 instanceof Map<?, ?> map1) || !(o2 instanceof Map<?, ?> map2)) {
            return 0;
        }
        if (map1.get("time%") instanceof Double && map2.get("time%") instanceof Double) {
            return ((Double) map1.get("time%")).compareTo((Double) map2.get("time%"));
        }
        return 0;
    };
}
