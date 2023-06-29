public abstract class Token {
    protected String content;

    public final String getHtml() {
        test();
        return htmlStart() + this.content + htmlEnd();
    }

    abstract protected String htmlStart();
    abstract protected String htmlEnd();

    public void test(){

    }
}

