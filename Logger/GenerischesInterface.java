package Logger;

import java.util.Comparator;

public interface GenerischesInterface <T> extends Comparator<T> {

     int compare(T a, T b);
}
