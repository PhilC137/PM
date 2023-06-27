package Lambda_Methodenreferenz.Challenges;

import java.util.Comparator;

/**
 * Interface Kommentiert
 * @param <T>
 */
public interface GenerischesInterface <T> extends Comparator<T> {

    int compare(T a, T c);

}