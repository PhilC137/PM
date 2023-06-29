import java.util.Optional;
import java.util.concurrent.Callable;

public class Main {

    static boolean run = false;

    /**
     * Hier werden Computer gebaut mit individuellen Eigenschaften
     */
    public static void main(String[] args) {
        System.out.println("Willkommen bei Computer Creator!");


        Optional<Computer> cloudComputerMitWUMMS = ComputerFactory.computerFactory("nicht daheim", "viel Wumms");
        cloudComputerMitWUMMS.ifPresent(computer -> {
            System.out.println(computer.getGHZ());
            System.out.println(computer.getHDD());
            System.out.println(computer.getSSD());
            System.out.println(computer.getRAM());
        });


        ComputerFactory.computerFactory("mobil", "viel Wumms").ifPresent(computer -> {
            System.out.println(computer.getGHZ());
            System.out.println(computer.getHDD());
            System.out.println(computer.getSSD());
            System.out.println(computer.getRAM());
        });

        Optional<Computer> cloudComputerMitWUMMSI = ComputerFactory.computerFactory("nicht daheim", "viel Wumms");
        cloudComputerMitWUMMS.ifPresent(Computer::show);
        ;
    }
}
