package pt.up.fe.els2023.Command.Reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ReduceByKey extends Reduce<ReduceSelectors> {
    @Override
    protected Object reduce(List<Object> cellList) {
        switch (getSelector()) {
            case MIN:
                return new ArrayList<>(List.of((Map<String, Object>) cellList.get(0)));
            case MAX:
                return new ArrayList<>(List.of((Map<String, Object>) cellList.get(cellList.size() - 1)));
            case AVERAGE:
                return cellList.stream().mapToInt(element -> (int) element).average()
            case SUM:
                return new ArrayList<>();
            default:
                return null;
        }
    }

    public void setSelector(String selector) {
        setSelector(ReduceSelectors.valueOf(selector.toUpperCase()));
    }
}


public class Selectors {
    public static Function<List<?>, Object> SUM = (List<?> list) -> list.stream().mapToInt(element -> (int) element).sum();

    public static Function<List<?>, Object> AVERAGE = (List<?> list) -> ;
}
