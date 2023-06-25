package Logger;

import java.util.List;

public class StudentSort {

    /**
     * 1a: Sortiert die Studierendenliste mithilfe eines Lambda-Ausdrucks aufsteigend nach dem
     * Alter.
     *
     * @param students die zu sortierende Liste der Studierenden
     * @return die sortierte Liste mit Studierenden
     */
    public static List<Student> sort_1a(List<Student> students) {
        students.sort((s1, s2) -> s1.getBirthday().compareTo(s2.getBirthday()));


        return students;
    }

    /**
     * 1b: Sortiert die Studierendenliste mithilfe eines Lambda-Ausdrucks absteigend nach dem Namen.
     *
     * @param students die zu sortierende Liste der Studierenden
     * @return die sortierte Liste mit Studierenden
     */
    public static List<Student> sort_1b(List<Student> students) {
        students.sort((s2, s1) -> s1.getName().compareTo(s2.getName()));
        return students;
    }

    /**
     * 2a: Sortiert die Studierendenliste, mithilfe der compareByAge Methode unter Verwendung eines
     * Lambda-Ausdrucks, aufsteigend nach dem Alter.
     *
     * @param students die zu sortierende Liste der Studierenden
     * @return die sortierte Liste mit Studierenden
     */
    public static List<Student> sort_2a(List<Student> students) {
        students.sort((o1, o2) -> Student.compareByAge(o1,o2));

        return students;
    }

    /**
     * 2b: Sortiert die Studierendenliste, mithilfe der compareByAge Methode unter Verwendung einer
     * Methodenreferenz, aufsteigend nach dem Alter.
     *
     * @param students die zu sortierende Liste der Studierenden
     * @return die sortierte Liste mit Studierenden
     */
    public static List<Student> sort_2b(List<Student> students) {
        students.sort(Student::compareByAge);
        return students;
    }

    /**
     * 3a: Sortiert die Studierendenliste, mithilfe der compareByName Methode unter Verwendung eines
     * Lambda-Ausdrucks, aufsteigend nach dem Namen.
     *
     * @param students die zu sortierende Liste der Studierenden
     * @return die sortierte Liste mit Studierenden
     */
    public static List<Student> sort_3a(List<Student> students) {
        students.sort((o1, o2) -> o1.compareByName(o2));
        return students;
    }

    /**
     * 3b: Sortiert die Studierendenliste, mithilfe der compareByName Methode unter Verwendung einer
     * Methodenreferenz, aufsteigend nach dem Namen.
     *
     * @param students die zu sortierende Liste der Studierenden
     * @return die sortierte Liste mit Studierenden
     */
    public static List<Student> sort_3b(List<Student> students) {
        students.sort(Student::compareByName);
        return students;
    }

    /**
     * 4a: Sortiert die Studierendenliste absteigend nach dem Alter unter Verwendung einer Instanz
     * ihres Funktionsinterfaces.
     *
     * @param students die zu sortierende Liste der Studierenden
     * @return die sortierte Liste mit Studierenden
     */
    public static List<Student> sort_4a(List<Student> students) {
        GenerischesInterface<Student> g = (s1,s2) -> {return Student.compareByAge(s2,s1);};
        students.sort(g);
        return students;
    }
}
