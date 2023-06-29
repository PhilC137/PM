public class StringContent extends Token {

    @Override
    protected String htmlStart() {
        return "<font color=\"green\">";
    }

    @Override
    protected String htmlEnd() {
        return "</font>";
    }
    @Override
    public void test() {
        super.test();
        System.out.println("StringContent");
    }

}
