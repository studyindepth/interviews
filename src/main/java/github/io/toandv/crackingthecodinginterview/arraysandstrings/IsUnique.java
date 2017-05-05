package github.io.toandv.crackingthecodinginterview.arraysandstrings;

import java.util.Arrays;

/**
 * Problem: Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures
 * <p>
 * Created by toan on 5/4/17.
 */

public class IsUnique {

    public static boolean isUnique(String s) {
        /*
            1. sort the char array of the string
            2. check if every two successive chars are different
        */
        // sort the char array
        char[] a = s.toCharArray();
        Arrays.sort(a);
        // check if every two adjacent chars are different

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // TODO implement a sort
    // TODO implement a hash table

}
