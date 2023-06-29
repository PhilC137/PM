package Challenge;


public abstract class Drucker {

    public final void kopieren() {
        scannen();
        drucken();
    }

    abstract void scannen();

    abstract void drucken();
}
