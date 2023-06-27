package Lambda_Methodenreferenz.Challenges;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");

    private String name;
    private Date birthday;

    public Student(String name, String birthday) throws ParseException {
        this.name = name;
        this.birthday = DATE_FORMAT.parse(birthday);
    }


    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    static int compareByAge(Student a, Student b){
        return a.getBirthday().compareTo(b.getBirthday());

    }

    int compareByName(Student other){
        return name.compareTo(other.getName());
    }

}