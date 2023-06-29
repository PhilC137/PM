
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Studi s = new Studi();
        Person p = new Studi();
        Main.methode(p);

        

        List<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();

        System.out.println(p.getInfo(s));
        System.out.println(p.getInfo(p));

        List<String> str = Arrays.asList("a", "b", "A", "B");
        str.sort(String::compareToIgnoreCase);

        str.sort(((String o1,String o2) -> o1.compareToIgnoreCase(o2)));
    }

    static void methode(Person p){
        System.out.println("");
    }
}