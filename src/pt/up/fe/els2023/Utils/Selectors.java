package pt.up.fe.els2023.Utils;

import java.util.List;
import java.util.function.Function;

public class Selectors {
    public static Function<List<?>, Object> MAX = (List<?> sortedList) -> {
        return sortedList.get(sortedList.size() - 1);
    };

    public static Function<List<?>, Object> SUM = (List<?> list) -> {
        return list.stream().mapToInt(element -> (int) element).sum();
    };
}
