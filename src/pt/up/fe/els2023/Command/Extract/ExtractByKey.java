package pt.up.fe.els2023.Command.Extract;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtractByKey extends Extract<ExtractSelectors>{
    @Override
    protected List<Map<String, Object>> select(List cellList) {
        switch (getSelector()) {
            case FIRST, MIN:
                return new ArrayList<>(List.of((Map<String, Object>) cellList.get(0)));
            case LAST, MAX:
                return new ArrayList<>(List.of((Map<String, Object>) cellList.get(cellList.size() - 1)));
            case MEDIAN:
                return new ArrayList<>(List.of((Map<String, Object>) cellList.get(cellList.size() / 2)));
            default:
                return null;
        }
    }

    public void setSelector(String selector) {
        setSelector(ExtractSelectors.valueOf(selector.toUpperCase()));
    }
}
