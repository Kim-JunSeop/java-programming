public class Dummy {
    private int attr;
    final int maxAttr = 100;
    final int minAttr = 0;

    public int getAttr() {
        return attr;
    }

    public void setAttr(int attr) {
        if (attr > maxAttr) {
            this.attr = maxAttr;
        } else if (attr < minAttr) {
            this.attr = minAttr;
        }
        this.attr = attr;
    }

    void print() {
        System.out.println("Hello, I'm dummy");
    }
}