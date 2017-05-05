package github.io.toandv.crackingthecodinginterview.arraysandstrings;

import java.util.Arrays;
import java.util.Random;

/**
 * https://visualgo.net/en/sorting
 * Created by toan on 5/4/17.
 */
public class Sorts {

    static int count = 0;

    public static void main(String[] args) {

        Random random = new Random();

        Integer[] a = new Integer[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10) + i;
        }

        Object[] aux = a.clone();
        System.out.println("start");
        mergeSort(aux, a, 0, a.length, 0);
        System.out.println(a);

    }


    private static void mergeSort(Object[] src,
                                  Object[] dest,
                                  int low,
                                  int high, int depth) {
        String indention = "" + depth;
        for (int i = 0; i < depth; i++) {
            indention += "  ";
        }
        int length = high - low;
        if (length <= 1) {
            return;
        }
        System.out.println(indention + "Entered: low=" + low + ", high=" + high);

        // Recursively sort halves of dest into src
        int destLow = low;
        int destHigh = high;
        int mid = (low + high) >>> 1;
        mergeSort(dest, src, low, mid, depth + 1);
        mergeSort(dest, src, mid, high, depth + 1);

        // Merge sorted halves (now in src) into dest
        for (int i = destLow, p = low, q = mid; i < destHigh; i++) {
            if (q >= high || p < mid && ((Comparable) src[p]).compareTo(src[q]) <= 0)
                dest[i] = src[p++];
            else
                dest[i] = src[q++];
        }
        System.out.println(indention + "Exiting: low=" + low + ", high=" + high);
    }

}
