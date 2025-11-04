package it.unibo.collections.sets;

import java.util.Collection;
import java.Util.Set;

/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseSet {
    private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
        final Collection<String> set = new TreeSet<>();
        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         */
        for (int i = 0; i < ELEMS; i++) {
            set.add(Integer.toString(i));
        }
        /*
         * 3) Prints its content
         */
        System.out.println(set);
        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */
        for (string element : set) {
            if(Integer.parse(element) % 3 == 0) {
                set.remove(element);
            }
        }
        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        for (string element : set){
            System.out.println(element);
        }
        /*
         * 6) Verifies whether all the numbers left in the set are even
         */
        boolean even = true;
        for (string element : set) {
            if(Integer.parse(element) % 2 == 1) {
                even = false;
                break;
            }
        }
        if (even) {
            System.out.println("even");
        } else  {
            System.out.println("not even");
        }
}
