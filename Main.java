import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import static java.util.Arrays.stream;

public class Main {
    /**
     * Hallo
     * @param args
     *

     */

    public static void main(String[] args) {
        KatzenCafe cafe = new KatzenCafe();
        Box box1 = new Box(5, 5, 5, Material.KARTON);
        cafe.addKatze(Optional.of(new Katze("Molli",15,box1)));

        Optional<Katze> greebo = cafe.getKatzeByGewicht(10, 20);
        greebo.ifPresent(katze -> System.out.println(katze.name()));


        Box box2 = new Box(5, 5, 5, Material.KISSEN);
        cafe.addKatze(Optional.of(new Katze("Jolli",21,box2)));

        //cafe.getKatzenZurBox(box).ifPresent(k ->k.forEach(e->System.out.println(e.name())));

        cafe.getKatzenZurBox(box2).ifPresent(e->e.stream().forEach(k -> System.out.println(k.name())));

    }
}
