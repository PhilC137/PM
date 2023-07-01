import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        LexerUI lexerUI = new LexerUI();

        Pattern philips = Pattern.compile("\\/\\*\\*([\\s\\S]*?)\\*\\/");
        Matcher phil = philips.matcher("/** Philip hats drauf \n ihrnutten */");
        System.out.println("Phils Doc: " + phil.matches());

        Pattern p1 = Pattern.compile("^/\\\\*(.*?)\\\\*/");
        Matcher mOlli = p1.matcher("/*Olli ist schlau\nTest\n*/");
        System.out.println("Ollis Mehrzeiler: "+mOlli.matches());

        /**
         * hier bin  Ich Jan
         */
        Pattern p = Pattern.compile("/\\*\\*([^\\*]|\\*(?!/))*?.*?\\*/");
        Matcher m = p.matcher("/**\n Hallo ich\n*\n* \n*@return\n*\n */");
        if (m.matches())
        {
            System.out.println("LOL");
        }
       System.out.println("//Test".matches("^//.*$"));


        // TODO Java-Doc-Kommentar
        Pattern pascal = Pattern.compile("^/{1}[*]{2,}[nA-Za-z\\\\0-9\\s\\*\\w]*[*][/]$");
        Matcher mPascal = pascal.matcher("/*****\ntext\n*param\n*\n* Hallo */");
        System.out.println("Java Doc: " + mPascal.matches());

    }
}
/***
 * Hallo ich\n
 *
 * @return
 *
 */