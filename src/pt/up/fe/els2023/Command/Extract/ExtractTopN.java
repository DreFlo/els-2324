package pt.up.fe.els2023.Command.Extract;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtractTopN extends Extract{
    @Override
    protected List<Map<String, Object>> selector(List<Map<String, Object>> cellList) {
        // Reverse the list
        List<Map<String, Object>> reversedList = new ArrayList<>();

        for (int i = cellList.size() - 1; i >= 0; i--) {
            reversedList.add(cellList.get(i));
        }

        int end = Math.min(getNumberOfColumns(), reversedList.size());

        // Return the first n elements
        List<Map<String, Object>> result = new ArrayList<>(reversedList.subList(0, end));

        while (result.size() < getNumberOfColumns()) {
            result.add(null);
        }

        return result;
    }

    public void setN(int n) {
        setNumberOfColumns(n);
    }
}
