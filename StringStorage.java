import java.util.ArrayList;
import java.util.Collections;
public class StringStorage {
    private ArrayList<String> strings;

    public StringStorage() {
        this.strings = new ArrayList<>();
    }
    public void addString(String str) {
        strings.add(str);
        strings.sort((a, b) -> Integer.compare(a.length(), b.length()));
    }

    public String getMaxString() {
        if (strings.isEmpty()) {
            return null;
        }
        return strings.get(strings.size() - 1);
    }
    public double getAverageLength() {
        if (strings.isEmpty()) {
            return 0;
        }
        int totalLength = strings.stream().mapToInt(String::length).sum();
        return (double) totalLength / strings.size();
    }
    public void printStrings() {
        System.out.println("Strings in storage: " + strings);
    }
}

