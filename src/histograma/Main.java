package histograma;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,4,7,1,1,8,4,1,4,9};
        Histogram miHisto = new Histogram(array);
        HashMap<Integer,Integer> histogram = miHisto.getHistogram();
        System.out.println(histogram);
    }
}


