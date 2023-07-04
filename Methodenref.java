import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Methodenref {

    private static ArrayList<Methodenref> liste = new ArrayList<>();

 static ArrayList<String> li = new ArrayList<>();

    private Methodenref test() {

        return new Methodenref();
    }


    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[A-Za-z0-9_-]+[@]([A-Za-z0-9_-]+[.])?[a-z]{2,3}");
        Matcher m = pattern.matcher("name-Ole@f.de");
        if (m.matches()) System.out.println("Passt");


        li.add("8");
        li.add("1");

        long count = li.stream()
                .mapToInt(Integer::parseInt)
                .filter(s -> s > 4)
                .sum();

        System.out.println(count);
    }
}
