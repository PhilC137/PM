
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class KatzenCafe {
    private static List<Katze> katzen;

    /**
     * Füge eine Katze dem Café hinzu
     *
     * @param katze
     */
    public void addKatze(Optional<Katze> katze) {
        if (katze.isEmpty()) return;
        if (katzen == null) katzen = new ArrayList<>();
        katzen.add(katze.get());
    }

    /**
     * @param minGewicht Gewicht Untergrenze
     * @param maxGewicht Gewicht Obergrenze
     * @return Die erste Katze im Café, deren Gewicht zwischen den Werten liegt
     */
    public Optional<Katze> getKatzeByGewicht(float minGewicht, float maxGewicht) {
        if (katzen == null) return Optional.empty();
        if (minGewicht < 0) return Optional.empty();
        if (maxGewicht < minGewicht) return Optional.empty();
        for (Katze k : katzen) {
            if (k.gewicht() >= minGewicht && k.gewicht() < maxGewicht) return Optional.ofNullable(k);
        }
        return Optional.empty();
    }

    /**
     * @param box Box zu der die passenden Katzen gesucht werden
     * @return Alle Café-Katzen, deren Lieblingsbox übergeben wurde
     */
    public static Optional<List<Katze>> getKatzenZurBox(Box box) {
        if (katzen==null) return Optional.empty();
        if (box == null) return Optional.empty();
        List<Katze> katzenZurBox = new ArrayList<>();
        katzen.stream()
                .filter(katze -> katze.lieblingsBox().equals(box))
                .forEach(katzenZurBox::add);
/*
        for (Katze k : katzen) {
            if (k.lieblingsBox() != null) {
                if (k.lieblingsBox().equals(box)) {
                    katzenZurBox.add(k);
                }
            }
        }
        return Optional.of(katzenZurBox);
        */
        return Optional.ofNullable(katzenZurBox);
    }
}