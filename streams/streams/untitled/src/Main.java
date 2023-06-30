

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static final String FILE_PATH_STRING = "file.txt";

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("main a:" + main.a());
        System.out.println("main new: " + main.al());

        List<Student> studentList =
                Arrays.asList(
                        new Student("A", 30),
                        new Student("B", 45),
                        new Student("C", 60),
                        new Student("D", 45),
                        new Student("E", 80));

        System.out.println(main.b(studentList));

        Path path = Paths.get(FILE_PATH_STRING);
        System.out.println(path.toAbsolutePath());

        try {
            System.out.println(main.c(path));
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            System.out.println(main.cs(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println( main.bs(studentList));

    }

    public List<Integer> a() {
        Random r = new Random();
        List<Integer> randomIntegers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomIntegers.add(r.nextInt(10));
        }
        List<Integer> returnList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (randomIntegers.get(i) % 2 == 0) {
                returnList.add(randomIntegers.get(i) * randomIntegers.get(i));
            }
        }
        return returnList;
    }

    public List<Integer> al(){
        Random r = new Random();
        List<Integer> randomIntegers = r.ints(10, 0, 10) // Generiere 10 Zufallszahlen zwischen 0 und 9
                .boxed() // Wandele die Zahlen in Integer-Objekte um
                .collect(Collectors.toList()); // Sammle die Zahlen in einer List<Integer>

        List<Integer> returnList = randomIntegers.stream()
                .filter(n -> n % 2 == 0) // Filtere nur gerade Zahlen
                .map(n -> n * n) // Quadriere jede Zahl
                .collect(Collectors.toList()); // Sammle die Ergebnisse in einer neuen List<Integer>

        return returnList;
    }


    public Integer b(List<Student> studentList) {
        Integer sum = 0;
        for (Student s : studentList) {
            sum += s.getCps();
        }
        return sum;


    }
    public Integer bs(List<Student> studentList) {
    int sum = studentList.stream()
           .mapToInt(Student::getCps)
           .sum();

    return sum;
    }




    public String c(Path path) throws IOException {
        String startingWithAExceptFirst = "";
        List<String> allLines = new ArrayList<>();
        BufferedReader r = Files.newBufferedReader(path);
        String newLine = r.readLine();
        while (newLine != null){
            allLines.add(newLine);
            newLine = r.readLine();
        }


        for (int i = 1; i < allLines.size(); i++) {
            if (allLines.get(i).startsWith("a")) {
                startingWithAExceptFirst += allLines.get(i) + "\n";
            }
        }
        return startingWithAExceptFirst;
    }

    public String cs(Path path) throws IOException{
        String startingWithAExceptFirst;
        List<String> allLines = Files.lines(path)
                .collect(Collectors.toList());



       startingWithAExceptFirst =  allLines.stream()
                .filter(w -> w.startsWith("a"))
               .collect(Collectors.joining("\n"));



        return startingWithAExceptFirst;
    }


}
