
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Lexer {
    private final List<Token> tokenizer = new ArrayList<>();

    public Lexer() {


        // Fügen Sie hier die einzelnen Token hinzu. Beispiel:
        Color colors = new Color(200,20,200);
        Pattern p = Pattern.compile("//.*");//Kommentare
        Pattern p4 = Pattern.compile("import");
        ////Pattern p2 = Pattern.compile("/\\*\\*([^\\*]|\\*(?!/))*?.*?\\*/");
        Pattern p3 = Pattern.compile("^/{1}[*]{2,}[\nA-Za-z0-9\\*\\s]*[*][/]$");
        //tokenizer.add(new Token(p2, 0, new Color(100,20,200)));
        tokenizer.add(new Token(p3, 0, new Color(100,250,200)));
        tokenizer.add(new Token(p4, 0, new Color(100,250,200)));

        tokenizer.add(new Token(p, 0, colors));

        // TODO einzeiliger Kommentar
        // TODO mehrzeiliger Kommentar
        // TODO Java-Doc-Kommentar
        // TODO Strings
        // TODO CharacterContent

        // TODO KeyWords: package, import, class, public, private, final, return, null, new

        // TODO Annotation
    }

    public List<MyMatchResult> tokenize(String s) {
        List<MyMatchResult> results = new ArrayList<>();
        tokenizer.forEach(t -> results.addAll(t.test(s)));
        return results;
    }
}