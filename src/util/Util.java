package util;

import java.util.Collection;

public class Util {

    //showCollection() takes some collection as a parameter and shows each element of this collection
    public static <T> void showCollection(Collection<T> col) {
        for (Object o : col) {
            System.out.println(o);
        }
    }
}
