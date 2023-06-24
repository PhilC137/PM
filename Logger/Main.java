package Logger;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Kommentar
     */
    public static void  test(){

    }

    /**
     *
     * @param args
     * @throws ParseException
     */
    public static void main(String[] args) throws ParseException {
        List<Student> list = new ArrayList<>();
        list.add(new Student("b","21.08.1995"));
        list.add(new Student("d","21.08.2000"));
        list.add(new Student("a","21.08.1991"));


        StudentSort.sort_3a(list);
    }
}
