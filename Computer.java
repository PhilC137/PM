public abstract  class Computer {

    private final int RAM;
    private final int CPU;
    private final double GHZ;
    private final int HDD;
    private final int SSD;


    Computer(int RAM, int CPU, int howMuchHDDs, int howMuchSSDs,int Gb, double GHZ){
        this.RAM = RAM;
        this.CPU = CPU;
        this.HDD = howMuchHDDs;
        this.SSD = howMuchSSDs;
        this.GHZ = GHZ;
    }

    public int getRAM() {
        return RAM;
    }

    public int getCPU() {
        return CPU;
    }

    public double getGHZ() {
        return GHZ;
    }

    public int getHDD() {
        return HDD;
    }

    public int getSSD() {
        return SSD;
    }

    public static void show(Computer test){
        System.out.println(test.getGHZ());
        System.out.println(test.getHDD());
        System.out.println(test.getSSD());
        System.out.println(test.getRAM());}


}
