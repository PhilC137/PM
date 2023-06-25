package Logger;

import java.util.Comparator;

/**
 * Interface Kommentiert
 * @param <T>
 */
public interface GenerischesInterface <T> extends Comparator<T> {

     /**
      * Comment
      * @param a the first object to be compared.
      * @param b the second object to be compared.
      * @return
      */
     int compare(T a, T b);
}
