package histograma;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Integer[] vector = {1,4,7,1,1,8,4,1,4,9};
        String[] vector1 = {"Ana", "Juan", "Pedro", "Ana", "Juan", "Juan"};
        
        Histogram <Integer> histogram = CalculaHistogram.calcHisto(vector);
        for (Object key : histogram.keySet()) {
            System.out.println(key + " ->" + histogram.get(key));
            
        }
        

        System.out.println(histogram);
    }
}


