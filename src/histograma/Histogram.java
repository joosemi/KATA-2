package histograma;

import java.util.HashMap;

public class Histogram {
    private final int[] array;

    public Histogram(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }
    
    public HashMap<Integer, Integer> getHistogram() {
        HashMap<Integer, Integer> histogram = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(!histogram.containsKey(array[i])) {
                histogram.put(array[i],0);
            }
            histogram.put(array[i], histogram.get(array[i])+1);
        }
        return histogram;
    }
}
