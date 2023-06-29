public class KeyWord extends Token {
    @Override
    public String htmlStart() {
        return "<font color=\"red\"><b>";
    }

    @Override
    protected String htmlEnd() {
        return "</b></font>";
    }

    @Override
    public void test() {
        super.test();
        System.out.println("KeyWord");
    }
}

