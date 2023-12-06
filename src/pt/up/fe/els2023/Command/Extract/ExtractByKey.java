package pt.up.fe.els2023.Command.Extract;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ExtractByKey extends Extract{
    private ExtractSelectors selector;

    @Override
    protected List<Map<String, Object>> selector(List<Map<String, Object>> cellList) {
        switch (selector) {
            case FIRST, MIN:
                return new ArrayList<>(List.of(cellList.get(0)));
            case LAST, MAX:
                return new ArrayList<>(List.of(cellList.get(cellList.size() - 1)));
            case MEDIAN:
                return new ArrayList<>(List.of(cellList.get(cellList.size() / 2)));
            default:
                return null;
        }
    }

    public void setSelector(ExtractSelectors selector) {
        this.selector = selector;
    }

    public void setSelector(String selector) {
        this.selector = ExtractSelectors.valueOf(selector.toUpperCase());
    }
}
