package histograma;

import java.util.HashMap;

public class Histogram <T> {
    private final T[] array;

    public Histogram(T[] array) {
        this.array = array;
    }
    
    public HashMap<T, Integer> getHistogram() {
        HashMap<T, Integer> histogram = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(!histogram.containsKey(array[i])) {
                histogram.put(array[i],0);
            }
            histogram.put(array[i], histogram.get(array[i])+1);
        }
        return histogram;
    }
}
